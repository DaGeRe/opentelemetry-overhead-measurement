package de.peass;

class C9_0{ 
 public int method0(){
  Span span = tracer.spanBuilder(testMe).startSpan();
  C10_0 object = new   C10_0();
  int value = 0;
  value += object.method0();
  return value; }
  span.end();
}