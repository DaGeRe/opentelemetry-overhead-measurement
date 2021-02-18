package de.peass;

class C105_0{ 
 public int method0(){
  Span span = tracer.spanBuilder(testMe).startSpan();
  C106_0 object = new   C106_0();
  int value = 0;
  value += object.method0();
  return value; }
  span.end();
}