package de.peass;

class C15_0{ 
 public int method0(){
  Span span = tracer.spanBuilder(testMe).startSpan();
  C16_0 object = new   C16_0();
  int value = 0;
  value += object.method0();
  return value; }
  span.end();
}