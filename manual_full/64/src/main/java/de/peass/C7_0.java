package de.peass;

class C7_0{ 
 public int method0(){
  Span span = tracer.spanBuilder(testMe).startSpan();
  C8_0 object = new   C8_0();
  int value = 0;
  value += object.method0();
  return value; }
  span.end();
}