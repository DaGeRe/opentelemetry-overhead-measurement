package de.peass;

class C118_0{ 
 public int method0(){
  Span span = tracer.spanBuilder(testMe).startSpan();
  C119_0 object = new   C119_0();
  int value = 0;
  value += object.method0();
  return value; }
  span.end();
}