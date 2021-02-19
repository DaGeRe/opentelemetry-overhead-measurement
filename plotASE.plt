set encoding iso_8859_1
set terminal pdf size 8,5

set out 'probes_opentelemetry.pdf'

set title 'Iteration Measurement Duration (OpenTelemetry)'

set logscale x

set xlabel 'Level Count'
set ylabel 'Duration in ms'

plot 'manual_full.csv' u 1:2 w linespoint lc "red" title 'Manual Instrumentation', \
	'manual_full.csv' u 1:($2*(1-$3)):($2*(1+$3)) w filledcurves lc "red" notitle fs transparent solid 0.5, \
	'javaagent_full.csv' u 1:2 w linespoint lc "yellow" title 'Javaagent Instrumentation', \
	'javaagent_full.csv' u 1:($2*(1-$3)):($2*(1+$3)) w filledcurves lc "yellow" notitle fs transparent solid 0.5

unset output

