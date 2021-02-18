package de.peass;

class C41_0{ 
 public int method0(){
  Span span = tracer.spanBuilder(testMe).startSpan();
  C42_0 object = new   C42_0();
  int value = 0;
  value += object.method0();
  return value; }
  span.end();
}