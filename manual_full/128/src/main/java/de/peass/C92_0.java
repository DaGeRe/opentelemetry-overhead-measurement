package de.peass;

class C92_0{ 
 public int method0(){
  Span span = tracer.spanBuilder(testMe).startSpan();
  C93_0 object = new   C93_0();
  int value = 0;
  value += object.method0();
  return value; }
  span.end();
}