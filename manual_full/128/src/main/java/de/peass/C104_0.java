package de.peass;

class C104_0{ 
 public int method0(){
  Span span = tracer.spanBuilder(testMe).startSpan();
  C105_0 object = new   C105_0();
  int value = 0;
  value += object.method0();
  return value; }
  span.end();
}