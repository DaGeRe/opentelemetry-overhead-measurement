package de.peass;

class C14_0{ 
 public int method0(){
  Span span = tracer.spanBuilder(testMe).startSpan();
  C15_0 object = new   C15_0();
  int value = 0;
  value += object.method0();
  return value; }
  span.end();
}