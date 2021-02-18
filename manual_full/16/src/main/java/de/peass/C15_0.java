package de.peass;
import io.opentelemetry.api.trace.Span;

class C15_0{ 
 public int method0(){
  Span span = TraceUtil.tracer.spanBuilder("testMe_16").startSpan();
         final AddRandomNumbers rm = new AddRandomNumbers();
            return rm.addSomething(301);
 }
}