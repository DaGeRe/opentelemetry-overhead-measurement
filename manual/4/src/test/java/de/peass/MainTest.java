package de.peass;

import org.junit.Test;
import org.junit.runner.RunWith;

import de.dagere.kopeme.annotations.PerformanceTest;
import de.dagere.kopeme.junit.testrunner.PerformanceTestRunnerJUnit;
import io.opentelemetry.api.trace.Span;

@RunWith(PerformanceTestRunnerJUnit.class)
public class MainTest {

   @PerformanceTest(warmup = 10, iterations = 10, repetitions = 100000, useKieker = false, dataCollectors = "ONLYTIME_NOGC", timeout=1000*60*60*10, redirectToNull=true)
   @Test
   public void testMe() {
      Span span = TraceUtil.tracer.spanBuilder("testMe").startSpan();
      
      C0_0 object = new C0_0();
      object.method0();
      
      span.end();
   }
   
}
