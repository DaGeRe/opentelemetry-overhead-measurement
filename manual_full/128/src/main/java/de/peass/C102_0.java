package de.peass;

class C102_0{ 
 public int method0(){
  Span span = tracer.spanBuilder(testMe).startSpan();
  C103_0 object = new   C103_0();
  int value = 0;
  value += object.method0();
  return value; }
  span.end();
}