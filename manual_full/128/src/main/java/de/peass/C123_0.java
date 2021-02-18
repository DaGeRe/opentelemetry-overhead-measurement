package de.peass;

class C123_0{ 
 public int method0(){
  Span span = tracer.spanBuilder(testMe).startSpan();
  C124_0 object = new   C124_0();
  int value = 0;
  value += object.method0();
  return value; }
  span.end();
}