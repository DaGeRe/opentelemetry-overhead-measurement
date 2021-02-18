package de.peass;
import io.opentelemetry.api.trace.Span;

class C47_0{ 
 public int method0(){
  Span span = TraceUtil.tracer.spanBuilder("testMe_128").startSpan();
  C48_0 object = new   C48_0();
  int value = 0;
  value += object.method0();
  span.end();
  return value; }
}