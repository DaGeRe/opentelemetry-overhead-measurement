package de.peass;
import io.opentelemetry.api.trace.Span;

class C27_0{ 
 public int method0(){
  Span span = TraceUtil.tracer.spanBuilder("testMe_64").startSpan();
  C28_0 object = new   C28_0();
  int value = 0;
  value += object.method0();
  span.end();
  return value; }
}