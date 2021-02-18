package de.peass;

class C29_0{ 
 public int method0(){
  Span span = tracer.spanBuilder(testMe).startSpan();
  C30_0 object = new   C30_0();
  int value = 0;
  value += object.method0();
  return value; }
  span.end();
}