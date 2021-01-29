package de.peass;

import org.junit.Test;
import org.junit.runner.RunWith;

import de.dagere.kopeme.annotations.PerformanceTest;
import de.dagere.kopeme.junit.testrunner.PerformanceTestRunnerJUnit;
import io.opentelemetry.api.GlobalOpenTelemetry;
import io.opentelemetry.api.OpenTelemetry;
import io.opentelemetry.api.trace.Span;
import io.opentelemetry.api.trace.Tracer;
import io.opentelemetry.api.trace.propagation.W3CTraceContextPropagator;
import io.opentelemetry.context.Context;
import io.opentelemetry.context.propagation.ContextPropagators;
import io.opentelemetry.context.propagation.TextMapPropagator;
import io.opentelemetry.exporter.logging.LoggingSpanExporter;
import io.opentelemetry.exporter.zipkin.ZipkinSpanExporterBuilder;
import io.opentelemetry.sdk.trace.ReadWriteSpan;
import io.opentelemetry.sdk.trace.ReadableSpan;
import io.opentelemetry.sdk.trace.SdkTracerProvider;
import io.opentelemetry.sdk.trace.SpanProcessor;
import io.opentelemetry.sdk.OpenTelemetrySdk;
import io.opentelemetry.sdk.trace.export.BatchSpanProcessor;
import io.opentelemetry.sdk.trace.export.BatchSpanProcessorBuilder;
import io.opentelemetry.sdk.trace.export.SimpleSpanProcessor;
import io.opentelemetry.sdk.trace.export.SpanExporter;

@RunWith(PerformanceTestRunnerJUnit.class)
public class MainTest {

   private static final SpanExporter exporter = new ZipkinSpanExporterBuilder()
         .setServiceName("Test")
         .setEndpoint("http://localhost:9411/api/v2/spans")
         .build();
   private static final OpenTelemetry openTelemetry = initOpenTelemetry(exporter);
   private static final Tracer tracer = openTelemetry.getTracer("de.peass.MainTest");

   private static OpenTelemetry initOpenTelemetry(SpanExporter loggingExporter) {
      // install the W3C Trace Context propagator
      // Get the tracer management instance
      SdkTracerProvider sdkTracerProvider = SdkTracerProvider.builder().build();
      
//      final SimpleSpanProcessor processor = SimpleSpanProcessor.builder(loggingExporter).build();
      final SpanProcessor processor = BatchSpanProcessor.builder(loggingExporter)
            .setScheduleDelayMillis(5000)
            .setExporterTimeoutMillis(5000)
            .build();
      sdkTracerProvider.addSpanProcessor(processor);

      
      
//      SpanProcessor test = BatchSpanProcessor.builder(loggingExporter).build();
      
      return OpenTelemetrySdk.builder()
          .setTracerProvider(sdkTracerProvider)
          .setPropagators(GlobalOpenTelemetry.getPropagators())
          .build();
    }
   
   @PerformanceTest(warmup = 10, iterations = 10, repetitions = 100000, useKieker = false, 
          dataCollectors = "ONLYTIME_NOGC", timeout=1000*60*60*10)
   @Test
   public void testMe() {
      Span span = tracer.spanBuilder("testMe").startSpan();
      
      C0_0 object = new C0_0();
      object.method0();
      
      span.end();
   }
   
}
