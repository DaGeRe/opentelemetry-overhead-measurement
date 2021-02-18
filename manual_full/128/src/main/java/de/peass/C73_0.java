package de.peass;

class C73_0{ 
 public int method0(){
  Span span = tracer.spanBuilder(testMe).startSpan();
  C74_0 object = new   C74_0();
  int value = 0;
  value += object.method0();
  return value; }
  span.end();
}