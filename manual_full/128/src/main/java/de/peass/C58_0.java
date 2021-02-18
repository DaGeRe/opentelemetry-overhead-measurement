package de.peass;

class C58_0{ 
 public int method0(){
  Span span = tracer.spanBuilder(testMe).startSpan();
  C59_0 object = new   C59_0();
  int value = 0;
  value += object.method0();
  return value; }
  span.end();
}