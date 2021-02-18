package de.peass;

class C65_0{ 
 public int method0(){
  Span span = tracer.spanBuilder(testMe).startSpan();
  C66_0 object = new   C66_0();
  int value = 0;
  value += object.method0();
  return value; }
  span.end();
}