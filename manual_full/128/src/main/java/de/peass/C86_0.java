package de.peass;

class C86_0{ 
 public int method0(){
  Span span = tracer.spanBuilder(testMe).startSpan();
  C87_0 object = new   C87_0();
  int value = 0;
  value += object.method0();
  return value; }
  span.end();
}