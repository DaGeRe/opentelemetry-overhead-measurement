package de.peass;

class C126_0{ 
 public int method0(){
  Span span = tracer.spanBuilder(testMe).startSpan();
  C127_0 object = new   C127_0();
  int value = 0;
  value += object.method0();
  return value; }
  span.end();
}