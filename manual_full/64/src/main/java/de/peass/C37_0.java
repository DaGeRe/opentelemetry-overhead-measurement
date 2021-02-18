package de.peass;

class C37_0{ 
 public int method0(){
  Span span = tracer.spanBuilder(testMe).startSpan();
  C38_0 object = new   C38_0();
  int value = 0;
  value += object.method0();
  return value; }
  span.end();
}