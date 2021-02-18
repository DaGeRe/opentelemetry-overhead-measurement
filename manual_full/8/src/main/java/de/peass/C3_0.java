package de.peass;
import io.opentelemetry.api.trace.Span;

class C3_0{ 
 public int method0(){
  Span span = TraceUtil.tracer.spanBuilder("testMe_8").startSpan();
  C4_0 object = new   C4_0();
  int value = 0;
  value += object.method0();
  span.end();
  return value; }
}