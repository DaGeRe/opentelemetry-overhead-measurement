function run {
	for i in {1..100}
	do
		echo "Executing $i"
		mvn clean test > $i.txt
	done
}

function getSum {
  awk '{sum += $1; square += $1^2} END {print sqrt(square / NR - (sum/NR)^2)" "sum/NR" "NR}'
}

if [ ! -d zipkin ]
then
	mkdir zipkin
	cd zipkin
	curl -sSL https://zipkin.io/quickstart.sh | bash -s
fi
cd zipkin
java -Xmx6g -jar zipkin.jar &
sleep 5
cd ..

if [ ! -f opentelemetry-javaagent-all.jar ]
then
	wget https://github.com/open-telemetry/opentelemetry-java-instrumentation/releases/latest/download/opentelemetry-javaagent-all.jar
fi

#docker run -d -p 9411:9411 openzipkin/zipkin

for treeDepth in 2 4 8 16 32 64 128
do
	cd $treeDepth
	run
	mv ~/.KoPeMe/de.peass.validation/simplevalidation/de.peass.MainTest/testMe.xml ../$treeDepth.xml
	cd ..
done

echo "DurationInsMS RelativeStandardDeviation"
for file in 2 4 8 16 32 64 128; do echo -n "$file "; cat $file.xml | grep "<result" -A 1 | grep value | tr -d "<value/>" | getSum | awk '{print $2/1000000" "$1/$2}'; done
