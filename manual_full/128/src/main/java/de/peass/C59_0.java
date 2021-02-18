package de.peass;

class C59_0{ 
 public int method0(){
  Span span = tracer.spanBuilder(testMe).startSpan();
  C60_0 object = new   C60_0();
  int value = 0;
  value += object.method0();
  return value; }
  span.end();
}