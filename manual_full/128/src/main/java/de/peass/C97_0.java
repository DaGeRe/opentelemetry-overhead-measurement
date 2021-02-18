package de.peass;

class C97_0{ 
 public int method0(){
  Span span = tracer.spanBuilder(testMe).startSpan();
  C98_0 object = new   C98_0();
  int value = 0;
  value += object.method0();
  return value; }
  span.end();
}