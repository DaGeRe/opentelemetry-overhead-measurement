package de.peass;

class C112_0{ 
 public int method0(){
  Span span = tracer.spanBuilder(testMe).startSpan();
  C113_0 object = new   C113_0();
  int value = 0;
  value += object.method0();
  return value; }
  span.end();
}