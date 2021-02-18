package de.peass;

class C113_0{ 
 public int method0(){
  Span span = tracer.spanBuilder(testMe).startSpan();
  C114_0 object = new   C114_0();
  int value = 0;
  value += object.method0();
  return value; }
  span.end();
}