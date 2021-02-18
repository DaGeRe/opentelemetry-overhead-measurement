package de.peass;
import io.opentelemetry.api.trace.Span;

class C13_0{ 
 public int method0(){
  Span span = TraceUtil.tracer.spanBuilder("testMe_16").startSpan();
  C14_0 object = new   C14_0();
  int value = 0;
  value += object.method0();
  span.end();
  return value; }
}