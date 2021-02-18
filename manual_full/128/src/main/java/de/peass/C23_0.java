package de.peass;

class C23_0{ 
 public int method0(){
  Span span = tracer.spanBuilder(testMe).startSpan();
  C24_0 object = new   C24_0();
  int value = 0;
  value += object.method0();
  return value; }
  span.end();
}