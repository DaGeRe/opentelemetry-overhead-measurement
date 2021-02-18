package de.peass;

class C26_0{ 
 public int method0(){
  Span span = tracer.spanBuilder(testMe).startSpan();
  C27_0 object = new   C27_0();
  int value = 0;
  value += object.method0();
  return value; }
  span.end();
}