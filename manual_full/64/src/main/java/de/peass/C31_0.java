package de.peass;

class C31_0{ 
 public int method0(){
  Span span = tracer.spanBuilder(testMe).startSpan();
  C32_0 object = new   C32_0();
  int value = 0;
  value += object.method0();
  return value; }
  span.end();
}