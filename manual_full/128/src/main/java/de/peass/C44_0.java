package de.peass;
import io.opentelemetry.api.trace.Span;

class C44_0{ 
 public int method0(){
  Span span = TraceUtil.tracer.spanBuilder("testMe_128").startSpan();
  C45_0 object = new   C45_0();
  int value = 0;
  value += object.method0();
  span.end();
  return value; }
}