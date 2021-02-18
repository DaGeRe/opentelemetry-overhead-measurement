package de.peass;

class C33_0{ 
 public int method0(){
  Span span = tracer.spanBuilder(testMe).startSpan();
  C34_0 object = new   C34_0();
  int value = 0;
  value += object.method0();
  return value; }
  span.end();
}