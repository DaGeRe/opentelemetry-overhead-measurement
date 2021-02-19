package de.peass;
import io.opentelemetry.api.trace.Span;
import io.opentelemetry.api.trace.Tracer;

class C51_0{ 
  public static final Tracer tracer = TraceUtil.openTelemetry.getTracer("de.peass.C51_0");
 public int method0(){
  Span span = tracer.spanBuilder("method0").startSpan();
  C52_0 object = new   C52_0();
  int value = 0;
  value += object.method0();
  span.end();
  return value; }
}