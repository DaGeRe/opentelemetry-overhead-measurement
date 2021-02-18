package de.peass;

class C101_0{ 
 public int method0(){
  Span span = tracer.spanBuilder(testMe).startSpan();
  C102_0 object = new   C102_0();
  int value = 0;
  value += object.method0();
  return value; }
  span.end();
}