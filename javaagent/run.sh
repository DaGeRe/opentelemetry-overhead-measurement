function run {
	for i in {1..100}
	do
		echo "Executing $i"
		mvn clean test > $i.txt
	done
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

cd 2 
run
mv ~/.KoPeMe/de.peass.validation/simplevalidation/de.peass.MainTest/testMe.xml 2.xml

cd ../4
run
mv ~/.KoPeMe/de.peass.validation/simplevalidation/de.peass.MainTest/testMe.xml 4.xml

cd ../8
run
mv ~/.KoPeMe/de.peass.validation/simplevalidation/de.peass.MainTest/testMe.xml 8.xml

