package de.peass;

class C75_0{ 
 public int method0(){
  Span span = tracer.spanBuilder(testMe).startSpan();
  C76_0 object = new   C76_0();
  int value = 0;
  value += object.method0();
  return value; }
  span.end();
}