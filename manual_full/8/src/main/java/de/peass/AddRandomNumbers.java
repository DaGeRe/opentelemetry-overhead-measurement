package de.peass;
import io.opentelemetry.api.trace.Span;
import io.opentelemetry.api.trace.Tracer;

import java.util.Random;

/**
 * Adds random numbers
 * 
 * @author reichelt
 *
 */
public class AddRandomNumbers {
  public static final Tracer tracer = TraceUtil.openTelemetry.getTracer("de.peass.AddRandomNumbers");

   private static final Random RANDOM = new Random();

   int x = 0;

   public int addSomething(int count) {
  Span span = tracer.spanBuilder("method0").startSpan();
      for (int i = 0; i < count; i++)
         x += RANDOM.nextInt(100);
      return x;
   }

   public int getValue() {
  Span span = tracer.spanBuilder("method0").startSpan();
      return x;
   }
}
