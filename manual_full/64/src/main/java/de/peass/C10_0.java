package de.peass;

class C10_0{ 
 public int method0(){
  Span span = tracer.spanBuilder(testMe).startSpan();
  C11_0 object = new   C11_0();
  int value = 0;
  value += object.method0();
  return value; }
  span.end();
}