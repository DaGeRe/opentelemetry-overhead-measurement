package de.peass;

class C25_0{ 
 public int method0(){
  Span span = tracer.spanBuilder(testMe).startSpan();
  C26_0 object = new   C26_0();
  int value = 0;
  value += object.method0();
  return value; }
  span.end();
}