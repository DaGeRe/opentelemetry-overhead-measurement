package de.peass;

class C106_0{ 
 public int method0(){
  Span span = tracer.spanBuilder(testMe).startSpan();
  C107_0 object = new   C107_0();
  int value = 0;
  value += object.method0();
  return value; }
  span.end();
}