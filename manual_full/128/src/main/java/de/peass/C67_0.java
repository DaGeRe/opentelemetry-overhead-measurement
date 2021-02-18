package de.peass;

class C67_0{ 
 public int method0(){
  Span span = tracer.spanBuilder(testMe).startSpan();
  C68_0 object = new   C68_0();
  int value = 0;
  value += object.method0();
  return value; }
  span.end();
}