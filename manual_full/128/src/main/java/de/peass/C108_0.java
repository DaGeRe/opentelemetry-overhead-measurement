package de.peass;

class C108_0{ 
 public int method0(){
  Span span = tracer.spanBuilder(testMe).startSpan();
  C109_0 object = new   C109_0();
  int value = 0;
  value += object.method0();
  return value; }
  span.end();
}