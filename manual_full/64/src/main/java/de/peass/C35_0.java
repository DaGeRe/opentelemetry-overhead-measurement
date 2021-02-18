package de.peass;

class C35_0{ 
 public int method0(){
  Span span = tracer.spanBuilder(testMe).startSpan();
  C36_0 object = new   C36_0();
  int value = 0;
  value += object.method0();
  return value; }
  span.end();
}