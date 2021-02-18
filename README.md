# Opentelemetry Overhead Benchmark

This project allows to measure the overhead of an Opentelemetry-instrumented run of a simple JUnit test with different tree sizes.

## Usage

The repository contains 4 experiment specifications: 
- javaagent (measures only the topmost level of a call tree using the OpenTelemetry-javaagent)
- javaagent_full (measures the full call tree using the OpenTelemetry-javaagent)
- manual (measures only the topmost level of a call tree using manual OpenTelemetry-instrumentation)
- manual_full (measures the full call tree using manual OpenTelemetry-instrumentation)

To execute the experiment, go to the prefered experiment folder and execute `./run.sh`. Afterwards, `result.csv` will contain the durations of execution of the workload with different call tree sizes.

## Re-Generation

If dependencies or workloads change, the source can be re-genereated using `./generateProjects.sh`. The script assumes that [precision-experiments-rca](https://github.com/DaGeRe/precision-experiments-rca/) is cloned to  `../precision-experiments-rca` and properly built. See the repository for details.


