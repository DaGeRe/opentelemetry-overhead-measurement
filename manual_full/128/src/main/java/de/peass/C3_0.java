package de.peass;

class C3_0{ 
 public int method0(){
  Span span = tracer.spanBuilder(testMe).startSpan();
  C4_0 object = new   C4_0();
  int value = 0;
  value += object.method0();
  return value; }
  span.end();
}