package de.peass;
import io.opentelemetry.api.trace.Span;

import java.util.Random;

/**
 * Adds random numbers
 * 
 * @author reichelt
 *
 */
public class AddRandomNumbers {

   private static final Random RANDOM = new Random();

   int x = 0;

   public int addSomething(int count) {
  Span span = TraceUtil.tracer.spanBuilder("testMe_16").startSpan();
      for (int i = 0; i < count; i++)
         x += RANDOM.nextInt(100);
      return x;
   }

   public int getValue() {
  Span span = TraceUtil.tracer.spanBuilder("testMe_16").startSpan();
      return x;
   }
}
