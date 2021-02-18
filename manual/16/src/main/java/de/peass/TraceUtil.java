package de.peass;

import io.opentelemetry.api.GlobalOpenTelemetry;
import io.opentelemetry.api.OpenTelemetry;
import io.opentelemetry.api.trace.Tracer;
import io.opentelemetry.exporter.zipkin.ZipkinSpanExporterBuilder;
import io.opentelemetry.sdk.OpenTelemetrySdk;
import io.opentelemetry.sdk.trace.SdkTracerProvider;
import io.opentelemetry.sdk.trace.SpanProcessor;
import io.opentelemetry.sdk.trace.export.BatchSpanProcessor;
import io.opentelemetry.sdk.trace.export.SpanExporter;

public class TraceUtil {
   private static final SpanExporter exporter = new ZipkinSpanExporterBuilder()
         .setServiceName("Test")
         .setEndpoint("http://localhost:9411/api/v2/spans")
         .build();
   private static final OpenTelemetry openTelemetry = initOpenTelemetry(exporter);
   public static final Tracer tracer = openTelemetry.getTracer("de.peass.MainTest");

   private static OpenTelemetry initOpenTelemetry(final SpanExporter loggingExporter) {
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
}
