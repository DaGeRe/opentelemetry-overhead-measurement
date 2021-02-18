package de.peass;

class C8_0{ 
 public int method0(){
  Span span = tracer.spanBuilder(testMe).startSpan();
  C9_0 object = new   C9_0();
  int value = 0;
  value += object.method0();
  return value; }
  span.end();
}