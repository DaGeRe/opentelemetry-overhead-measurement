package de.peass;

class C60_0{ 
 public int method0(){
  Span span = tracer.spanBuilder(testMe).startSpan();
  C61_0 object = new   C61_0();
  int value = 0;
  value += object.method0();
  return value; }
  span.end();
}