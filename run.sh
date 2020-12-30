function run {
	for i in {1..100}
	do
		echo "Executing $i"
		mvn clean test > $i.txt
	done
}

#docker run -d -p 9411:9411 openzipkin/zipkin

cd 2 
run
mv ~/.KoPeMe/de.peass.validation/simplevalidation/de.peass.MainTest/testMe.xml 2.xml

cd 4
run
mv ~/.KoPeMe/de.peass.validation/simplevalidation/de.peass.MainTest/testMe.xml 4.xml

#cd 8
#run

