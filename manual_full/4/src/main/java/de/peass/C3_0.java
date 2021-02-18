package de.peass;
import io.opentelemetry.api.trace.Span;

class C3_0{ 
 public int method0(){
  Span span = TraceUtil.tracer.spanBuilder("testMe_4").startSpan();
         final AddRandomNumbers rm = new AddRandomNumbers();
            return rm.addSomething(301);
 }
}