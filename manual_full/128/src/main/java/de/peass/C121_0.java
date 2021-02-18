package de.peass;
import io.opentelemetry.api.trace.Span;

class C121_0{ 
 public int method0(){
  Span span = TraceUtil.tracer.spanBuilder("testMe_128").startSpan();
  C122_0 object = new   C122_0();
  int value = 0;
  value += object.method0();
  span.end();
  return value; }
}