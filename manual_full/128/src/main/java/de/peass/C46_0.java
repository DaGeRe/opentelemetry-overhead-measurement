package de.peass;

class C46_0{ 
 public int method0(){
  Span span = tracer.spanBuilder(testMe).startSpan();
  C47_0 object = new   C47_0();
  int value = 0;
  value += object.method0();
  return value; }
  span.end();
}