package de.peass;

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
  Span span = tracer.spanBuilder(testMe).startSpan();
      for (int i = 0; i < count; i++)
         x += RANDOM.nextInt(100);
      return x;
  span.end();
   }

   public int getValue() {
  Span span = tracer.spanBuilder(testMe).startSpan();
      return x;
  span.end();
   }
}
