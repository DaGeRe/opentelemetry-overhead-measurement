package de.peass;
import io.opentelemetry.api.trace.Span;
import io.opentelemetry.api.trace.Tracer;

class C55_0{ 
  public static final Tracer tracer = TraceUtil.openTelemetry.getTracer("de.peass.C55_0");
 public int method0(){
  Span span = tracer.spanBuilder("method0").startSpan();
  C56_0 object = new   C56_0();
  int value = 0;
  value += object.method0();
  span.end();
  return value; }
}