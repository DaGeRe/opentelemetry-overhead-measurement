package de.peass;

class C22_0{ 
 public int method0(){
  Span span = tracer.spanBuilder(testMe).startSpan();
  C23_0 object = new   C23_0();
  int value = 0;
  value += object.method0();
  return value; }
  span.end();
}