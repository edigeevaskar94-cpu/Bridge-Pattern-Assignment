# Bridge Pattern Assignment

## Description

This project demonstrates the Bridge structural design pattern in Java.

The example separates the abstraction hierarchy from the implementation hierarchy.

### Abstraction
- Shape
- Circle
- Square

### Implementation
- Renderer
- VectorRenderer
- RasterRenderer

The Shape class contains a reference to Renderer, which creates the bridge between the two hierarchies.

## Runtime Switching

The renderer can be changed at runtime using the setRenderer() method.

Example:

```java
Shape circle = new Circle(vectorRenderer, 5);

circle.draw();

circle.setRenderer(rasterRenderer);

circle.draw();