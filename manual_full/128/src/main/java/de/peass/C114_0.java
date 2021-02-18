package de.peass;

class C114_0{ 
 public int method0(){
  Span span = tracer.spanBuilder(testMe).startSpan();
  C115_0 object = new   C115_0();
  int value = 0;
  value += object.method0();
  return value; }
  span.end();
}