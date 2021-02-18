package de.peass;

class C71_0{ 
 public int method0(){
  Span span = tracer.spanBuilder(testMe).startSpan();
  C72_0 object = new   C72_0();
  int value = 0;
  value += object.method0();
  return value; }
  span.end();
}