package de.peass;
import io.opentelemetry.api.trace.Span;
import io.opentelemetry.api.trace.Tracer;

class C62_0{ 
  public static final Tracer tracer = TraceUtil.openTelemetry.getTracer("de.peass.C62_0");
 public int method0(){
  Span span = tracer.spanBuilder("method0").startSpan();
  C63_0 object = new   C63_0();
  int value = 0;
  value += object.method0();
  span.end();
  return value; }
}