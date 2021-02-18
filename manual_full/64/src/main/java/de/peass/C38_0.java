package de.peass;
import io.opentelemetry.api.trace.Span;

class C38_0{ 
 public int method0(){
  Span span = TraceUtil.tracer.spanBuilder("testMe_64").startSpan();
  C39_0 object = new   C39_0();
  int value = 0;
  value += object.method0();
  span.end();
  return value; }
}