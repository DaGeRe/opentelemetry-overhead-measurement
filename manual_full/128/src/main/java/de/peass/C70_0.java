package de.peass;

class C70_0{ 
 public int method0(){
  Span span = tracer.spanBuilder(testMe).startSpan();
  C71_0 object = new   C71_0();
  int value = 0;
  value += object.method0();
  return value; }
  span.end();
}