package de.peass;

class C49_0{ 
 public int method0(){
  Span span = tracer.spanBuilder(testMe).startSpan();
  C50_0 object = new   C50_0();
  int value = 0;
  value += object.method0();
  return value; }
  span.end();
}