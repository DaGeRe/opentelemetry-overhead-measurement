package de.peass;

class C100_0{ 
 public int method0(){
  Span span = tracer.spanBuilder(testMe).startSpan();
  C101_0 object = new   C101_0();
  int value = 0;
  value += object.method0();
  return value; }
  span.end();
}