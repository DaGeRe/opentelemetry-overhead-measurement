package de.peass;

class C44_0{ 
 public int method0(){
  Span span = tracer.spanBuilder(testMe).startSpan();
  C45_0 object = new   C45_0();
  int value = 0;
  value += object.method0();
  return value; }
  span.end();
}