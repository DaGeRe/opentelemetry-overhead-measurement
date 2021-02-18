package de.peass;
import io.opentelemetry.api.trace.Span;

class C43_0{ 
 public int method0(){
  Span span = TraceUtil.tracer.spanBuilder("testMe_64").startSpan();
  C44_0 object = new   C44_0();
  int value = 0;
  value += object.method0();
  span.end();
  return value; }
}