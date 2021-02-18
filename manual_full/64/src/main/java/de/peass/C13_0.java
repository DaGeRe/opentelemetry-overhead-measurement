package de.peass;

class C13_0{ 
 public int method0(){
  Span span = tracer.spanBuilder(testMe).startSpan();
  C14_0 object = new   C14_0();
  int value = 0;
  value += object.method0();
  return value; }
  span.end();
}