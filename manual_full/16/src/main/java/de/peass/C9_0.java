package de.peass;
import io.opentelemetry.api.trace.Span;

class C9_0{ 
 public int method0(){
  Span span = TraceUtil.tracer.spanBuilder("testMe_16").startSpan();
  C10_0 object = new   C10_0();
  int value = 0;
  value += object.method0();
  span.end();
  return value; }
}