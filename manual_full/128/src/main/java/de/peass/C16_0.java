package de.peass;

class C16_0{ 
 public int method0(){
  Span span = tracer.spanBuilder(testMe).startSpan();
  C17_0 object = new   C17_0();
  int value = 0;
  value += object.method0();
  return value; }
  span.end();
}