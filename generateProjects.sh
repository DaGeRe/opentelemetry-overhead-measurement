
for instrumentation in javaagent manual
do
	echo "Instrumentation: $instrumentation"
	for treeDepth in 2 4 8 16 32 64 128
	do
		rm $instrumentation/$treeDepth -rf
		slower=$(($treeDepth-1))
		echo "Tree Depth: $treeDepth slower level: $slower"
		java -cp ../precision-experiments-rca/target/precision-experiments-rca-0.1-SNAPSHOT.jar de.peass.validate_rca.GenerateTreeExampleProject \
			-treeDepth $treeDepth -childCount 1 -slowerLevel $slower \
			-slowParameter 301 -fastParameter 300 -type ADD \
			-out temp &> temp.txt
		cp -R $instrumentation/raw $instrumentation/$treeDepth/
		mv temp/src/main/ $instrumentation/$treeDepth/src/main/
		rm temp -rf
	done
done 

rm -rf javaagent_full
cp -R javaagent javaagent_full

cd javaagent_full
for file in 2 4 8 16 32 64 128
do 
        for file in $(ls $file/src/main/java/*/*/C*)
        do 
                echo $file
                sed -i "/public int/i @io.opentelemetry.extension.annotations.WithSpan" $file
        done
done

