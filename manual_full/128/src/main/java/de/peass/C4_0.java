package de.peass;

class C4_0{ 
 public int method0(){
  Span span = tracer.spanBuilder(testMe).startSpan();
  C5_0 object = new   C5_0();
  int value = 0;
  value += object.method0();
  return value; }
  span.end();
}