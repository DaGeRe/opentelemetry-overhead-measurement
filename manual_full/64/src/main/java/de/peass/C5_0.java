package de.peass;

class C5_0{ 
 public int method0(){
  Span span = tracer.spanBuilder(testMe).startSpan();
  C6_0 object = new   C6_0();
  int value = 0;
  value += object.method0();
  return value; }
  span.end();
}