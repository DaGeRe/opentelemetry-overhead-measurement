package de.peass;

class C109_0{ 
 public int method0(){
  Span span = tracer.spanBuilder(testMe).startSpan();
  C110_0 object = new   C110_0();
  int value = 0;
  value += object.method0();
  return value; }
  span.end();
}