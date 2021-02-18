package de.peass;

class C68_0{ 
 public int method0(){
  Span span = tracer.spanBuilder(testMe).startSpan();
  C69_0 object = new   C69_0();
  int value = 0;
  value += object.method0();
  return value; }
  span.end();
}