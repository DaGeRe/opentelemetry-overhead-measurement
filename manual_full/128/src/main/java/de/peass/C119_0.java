package de.peass;

class C119_0{ 
 public int method0(){
  Span span = tracer.spanBuilder(testMe).startSpan();
  C120_0 object = new   C120_0();
  int value = 0;
  value += object.method0();
  return value; }
  span.end();
}