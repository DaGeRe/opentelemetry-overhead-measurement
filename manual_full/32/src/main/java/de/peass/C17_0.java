package de.peass;

class C17_0{ 
 public int method0(){
  Span span = tracer.spanBuilder(testMe).startSpan();
  C18_0 object = new   C18_0();
  int value = 0;
  value += object.method0();
  return value; }
  span.end();
}