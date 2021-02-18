package de.peass;

class C24_0{ 
 public int method0(){
  Span span = tracer.spanBuilder(testMe).startSpan();
  C25_0 object = new   C25_0();
  int value = 0;
  value += object.method0();
  return value; }
  span.end();
}