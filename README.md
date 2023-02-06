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

## References
- https://www.digitalocean.com/community/tutorials/java-design-patterns-example-tutorial