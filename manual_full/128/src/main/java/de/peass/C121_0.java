package de.peass;

class C121_0{ 
 public int method0(){
  Span span = tracer.spanBuilder(testMe).startSpan();
  C122_0 object = new   C122_0();
  int value = 0;
  value += object.method0();
  return value; }
  span.end();
}