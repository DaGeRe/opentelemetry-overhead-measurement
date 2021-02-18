package de.peass;

class C82_0{ 
 public int method0(){
  Span span = tracer.spanBuilder(testMe).startSpan();
  C83_0 object = new   C83_0();
  int value = 0;
  value += object.method0();
  return value; }
  span.end();
}