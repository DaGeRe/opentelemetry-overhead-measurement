package de.peass;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

import io.opentelemetry.api.GlobalOpenTelemetry;
import io.opentelemetry.api.OpenTelemetry;
import io.opentelemetry.exporter.zipkin.ZipkinSpanExporterBuilder;
import io.opentelemetry.sdk.OpenTelemetrySdk;
import io.opentelemetry.sdk.trace.SdkTracerProvider;
import io.opentelemetry.sdk.trace.SpanProcessor;
import io.opentelemetry.sdk.trace.export.BatchSpanProcessor;
import io.opentelemetry.sdk.trace.export.SpanExporter;

public class TraceUtil {
   private static final SpanExporter exporter = new ZipkinSpanExporterBuilder()
         .setEndpoint("http://localhost:9411/api/v2/spans")
         .build(); ;
   public static final OpenTelemetry openTelemetry = initOpenTelemetry(exporter);

   private static OpenTelemetry initOpenTelemetry(final SpanExporter loggingExporter) {
      final SpanProcessor processor = BatchSpanProcessor.builder(loggingExporter)
            .setExporterTimeout(Duration.of(5000, ChronoUnit.MILLIS))
            .build();
      
      SdkTracerProvider sdkTracerProvider = SdkTracerProvider.builder()
            .addSpanProcessor(processor)
            .build();
      
      return OpenTelemetrySdk.builder()
          .setTracerProvider(sdkTracerProvider)
          .setPropagators(GlobalOpenTelemetry.getPropagators())
          .build();
    }
}
