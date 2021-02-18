package de.peass;

class C38_0{ 
 public int method0(){
  Span span = tracer.spanBuilder(testMe).startSpan();
  C39_0 object = new   C39_0();
  int value = 0;
  value += object.method0();
  return value; }
  span.end();
}