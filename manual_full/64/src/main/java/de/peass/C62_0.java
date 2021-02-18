package de.peass;

class C62_0{ 
 public int method0(){
  Span span = tracer.spanBuilder(testMe).startSpan();
  C63_0 object = new   C63_0();
  int value = 0;
  value += object.method0();
  return value; }
  span.end();
}