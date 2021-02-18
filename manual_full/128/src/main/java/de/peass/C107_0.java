package de.peass;

class C107_0{ 
 public int method0(){
  Span span = tracer.spanBuilder(testMe).startSpan();
  C108_0 object = new   C108_0();
  int value = 0;
  value += object.method0();
  return value; }
  span.end();
}