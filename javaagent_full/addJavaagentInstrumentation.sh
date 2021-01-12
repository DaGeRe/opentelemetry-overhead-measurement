for file in 2 4 8 16 32 64 128
do 
	for file in $(ls $file/src/main/java/*/*/C*)
       	do 
		echo $file
		sed -i "/public void/i @io.opentelemetry.extension.annotations.WithSpan" $file
       	done
done
