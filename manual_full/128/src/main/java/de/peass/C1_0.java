package de.peass;

class C1_0{ 
 public int method0(){
  Span span = tracer.spanBuilder(testMe).startSpan();
  C2_0 object = new   C2_0();
  int value = 0;
  value += object.method0();
  return value; }
  span.end();
}