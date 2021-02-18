package de.peass;

class C2_0{ 
 public int method0(){
  Span span = tracer.spanBuilder(testMe).startSpan();
  C3_0 object = new   C3_0();
  int value = 0;
  value += object.method0();
  return value; }
  span.end();
}