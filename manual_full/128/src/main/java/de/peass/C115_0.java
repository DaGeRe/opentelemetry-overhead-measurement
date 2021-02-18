package de.peass;

class C115_0{ 
 public int method0(){
  Span span = tracer.spanBuilder(testMe).startSpan();
  C116_0 object = new   C116_0();
  int value = 0;
  value += object.method0();
  return value; }
  span.end();
}