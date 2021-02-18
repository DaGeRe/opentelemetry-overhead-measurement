package de.peass;

class C42_0{ 
 public int method0(){
  Span span = tracer.spanBuilder(testMe).startSpan();
  C43_0 object = new   C43_0();
  int value = 0;
  value += object.method0();
  return value; }
  span.end();
}