package de.peass;

class C110_0{ 
 public int method0(){
  Span span = tracer.spanBuilder(testMe).startSpan();
  C111_0 object = new   C111_0();
  int value = 0;
  value += object.method0();
  return value; }
  span.end();
}