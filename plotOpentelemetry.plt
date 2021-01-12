set encoding iso_8859_1
set terminal pdf size 8,5

set out 'opentelemetry.pdf'

set title 'Entwicklung der Iterationsmessdauer (OpenTelemetry)'

set logscale x

set xlabel 'Ebenenanzahl'
set ylabel 'Dauer in ms'

plot 'manual.csv' u 1:2 w linespoint lc "red" title 'Manuell', \
	'manual.csv' u 1:($2*(1-$3)):($2*(1+$3)) w filledcurves lc "red" notitle fs transparent solid 0.5, \
	'javaagent.csv' u 1:2 w linespoint lc "yellow" title 'Mit Javaagent', \
	'javaagent.csv' u 1:($2*(1-$3)):($2*(1+$3)) w filledcurves lc "yellow" notitle fs transparent solid 0.5

unset output

