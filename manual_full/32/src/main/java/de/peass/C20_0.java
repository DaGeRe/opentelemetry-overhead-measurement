package de.peass;
import io.opentelemetry.api.trace.Span;

class C20_0{ 
 public int method0(){
  Span span = TraceUtil.tracer.spanBuilder("testMe_32").startSpan();
  C21_0 object = new   C21_0();
  int value = 0;
  value += object.method0();
  span.end();
  return value; }
}