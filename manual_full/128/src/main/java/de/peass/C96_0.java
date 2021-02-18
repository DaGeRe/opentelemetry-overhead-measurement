package de.peass;

class C96_0{ 
 public int method0(){
  Span span = tracer.spanBuilder(testMe).startSpan();
  C97_0 object = new   C97_0();
  int value = 0;
  value += object.method0();
  return value; }
  span.end();
}