package de.peass;

class C55_0{ 
 public int method0(){
  Span span = tracer.spanBuilder(testMe).startSpan();
  C56_0 object = new   C56_0();
  int value = 0;
  value += object.method0();
  return value; }
  span.end();
}