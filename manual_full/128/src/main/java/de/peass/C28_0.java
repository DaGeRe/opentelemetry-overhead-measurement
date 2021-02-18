package de.peass;

class C28_0{ 
 public int method0(){
  Span span = tracer.spanBuilder(testMe).startSpan();
  C29_0 object = new   C29_0();
  int value = 0;
  value += object.method0();
  return value; }
  span.end();
}