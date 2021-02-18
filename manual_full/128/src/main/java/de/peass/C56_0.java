package de.peass;

class C56_0{ 
 public int method0(){
  Span span = tracer.spanBuilder(testMe).startSpan();
  C57_0 object = new   C57_0();
  int value = 0;
  value += object.method0();
  return value; }
  span.end();
}