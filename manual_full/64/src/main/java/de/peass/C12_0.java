package de.peass;

class C12_0{ 
 public int method0(){
  Span span = tracer.spanBuilder(testMe).startSpan();
  C13_0 object = new   C13_0();
  int value = 0;
  value += object.method0();
  return value; }
  span.end();
}