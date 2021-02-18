package de.peass;

class C51_0{ 
 public int method0(){
  Span span = tracer.spanBuilder(testMe).startSpan();
  C52_0 object = new   C52_0();
  int value = 0;
  value += object.method0();
  return value; }
  span.end();
}