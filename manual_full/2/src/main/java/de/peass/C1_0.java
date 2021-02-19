package de.peass;
import io.opentelemetry.api.trace.Span;
import io.opentelemetry.api.trace.Tracer;

class C1_0{ 
  public static final Tracer tracer = TraceUtil.openTelemetry.getTracer("de.peass.C1_0");
 public int method0(){
  Span span = tracer.spanBuilder("method0").startSpan();
         final AddRandomNumbers rm = new AddRandomNumbers();
            return rm.addSomething(301);
 }
}