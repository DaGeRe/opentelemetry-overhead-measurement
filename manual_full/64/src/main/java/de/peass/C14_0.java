package de.peass;
import io.opentelemetry.api.trace.Span;

class C14_0{ 
 public int method0(){
  Span span = TraceUtil.tracer.spanBuilder("testMe_64").startSpan();
  C15_0 object = new   C15_0();
  int value = 0;
  value += object.method0();
  span.end();
  return value; }
}