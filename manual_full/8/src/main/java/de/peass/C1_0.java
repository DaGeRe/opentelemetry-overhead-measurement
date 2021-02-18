package de.peass;
import io.opentelemetry.api.trace.Span;

class C1_0{ 
 public int method0(){
  Span span = TraceUtil.tracer.spanBuilder("testMe_8").startSpan();
  C2_0 object = new   C2_0();
  int value = 0;
  value += object.method0();
  span.end();
  return value; }
}