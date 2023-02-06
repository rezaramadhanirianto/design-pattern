# Design Pattern
My learning for design pattern

## Creation Pattern
Creational design patterns provide solutions to instantiate an Object in the best possible way for specific situations.

### Singleton
Singleton only have one instance in application and must provide global access to get instance of the class. Singleton design pattern example <code>java.lang.Runtime</code>.

### Factory
The factory design pattern is used when we have a superclass with multiple sub-classes and based on input, we need to return one of the sub-class.

### Abstract
Same function as factory pattern but the difference is how we check subclass, in abstract we have subclasses factory respectively.

### Builder
Builder pattern was introduced to solve some of the problems with Factory and Abstract Factory design patterns when the Object contains a lot of attributes.

### Prototype
The prototype pattern is used when the Object creation is costly and requires a lot of time and resources, and you have a similar Object already existing. So this pattern provides a mechanism to copy the original Object to a new Object and then modify it according to our needs.

## Structural Design Pattern
Structural design patterns provide different ways to create a Class structure (for example, using inheritance and composition to create a large Object from small Objects).

### Adapter
The adapter design pattern is one of the structural design patterns and is used so that two unrelated interfaces can work together.

### Composite
The composite pattern is used when we have to represent a part-whole hierarchy. When we need to create a structure in a way that the objects in the structure have to be treated the same way, we can apply the composite design pattern. for the example if we have some shapes like circle, triangle etc, and we want to change color all shapes, we can use composite pattern.

### Flyweight
The flyweight design pattern is used when we need to create a lot of Objects of a Class. Since every Object consumes memory space that can be crucial for low-memory devices (such as mobile devices or embedded systems), the flyweight design pattern can be applied to reduce the load on memory by sharing Objects. Example: <code>String pool</code>

## References
- https://www.digitalocean.com/community/tutorials/java-design-patterns-example-tutorial