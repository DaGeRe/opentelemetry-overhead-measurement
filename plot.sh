function getSum {
  awk '{sum += $1; square += $1^2} END {print sqrt(square / NR - (sum/NR)^2)" "sum/NR" "NR}'
}

for type in javaagent manual
do
	for file in 2 4 8 16 32 64 128; do echo -n "$file "; cat $type/$file.xml | grep "<result" -A 1 | grep value | tr -d "<value/>" | awk '{print $1/1000000}' | getSum | awk '{print $2" "$1/$2}'; done > $type.csv
done

gnuplot -c plotOpentelemetry.plt
