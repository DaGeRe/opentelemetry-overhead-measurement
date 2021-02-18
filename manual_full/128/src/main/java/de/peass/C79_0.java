package de.peass;

class C79_0{ 
 public int method0(){
  Span span = tracer.spanBuilder(testMe).startSpan();
  C80_0 object = new   C80_0();
  int value = 0;
  value += object.method0();
  return value; }
  span.end();
}