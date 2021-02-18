package de.peass;

class C32_0{ 
 public int method0(){
  Span span = tracer.spanBuilder(testMe).startSpan();
  C33_0 object = new   C33_0();
  int value = 0;
  value += object.method0();
  return value; }
  span.end();
}