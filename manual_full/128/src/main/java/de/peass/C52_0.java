package de.peass;

class C52_0{ 
 public int method0(){
  Span span = tracer.spanBuilder(testMe).startSpan();
  C53_0 object = new   C53_0();
  int value = 0;
  value += object.method0();
  return value; }
  span.end();
}