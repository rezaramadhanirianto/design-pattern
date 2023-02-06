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

### Proxy
The proxy pattern provides a placeholder for another Object to control access to it. This pattern is used when we want to provide controlled access to functionality.

### Flyweight
The flyweight design pattern is used when we need to create a lot of Objects of a Class. Since every Object consumes memory space that can be crucial for low-memory devices (such as mobile devices or embedded systems), the flyweight design pattern can be applied to reduce the load on memory by sharing Objects. Example: <code>String pool</code>

### Facade
The facade pattern is used to help client applications easily interact with the system.

### Bridge
When we have interface hierarchies in both interfaces as well as implementations, then the bridge design pattern is used to decouple the interfaces from the implementation and to hide the implementation details from the client programs.

### Decorator
The decorator design pattern is used to modify the functionality of an object at runtime. At the same time, other instances of the same class will not be affected by this, so the individual object gets the modified behavior.

## Behavioral
Behavioral patterns provide a solution for better interaction between objects and how to provide loose-coupling and flexibility to extend easily.

### Template Method
The template method pattern is a behavioral design pattern and is used to create a method stub and to defer some of the steps of implementation to the subclasses. The template method defines the steps to execute an algorithm, and it can provide a default implementation that might be common for all or some of the subclasses.

### Mediator
The mediator design pattern is used to provide a centralized communication medium between different objects in a system. If the objects interact with each other directly, the system components are tightly-coupled with each other which makes maintainability cost higher and not flexible to extend easily.

### Observer
An observer design pattern is useful when you are interested in the state of an Object and want to get notified whenever there is any change. In the observer pattern, the Object that watches the state of another Object is called observer, and the Object that is being watched is called subject.

### Chain Responsibility
The chain of responsibility pattern is used to achieve loose-coupling in software design where a request from the client is passed to a chain of objects to process them. Then the object in the chain will decide who will be processing the request and whether the request is required to be sent to the next object in the chain or not.

### Iterator
The iterator pattern is one of the behavioral patterns and is used to provide a standard way to traverse through a group of objects

### Strategy
We define multiple algorithms and let client application pass the algorithm to be used as a parameter. One of the best example of strategy pattern is <code>Collections.sort()</code> method that takes Comparator parameter.

### State
The state design pattern is used when an Object changes its behavior based on its internal state. If we have to change the behavior of an Object based on its state, we can have a state variable in the Object and use if-else condition block to perform different actions based on the state.

### Command
The command pattern is used to implement loose-coupling in a request-response model. In this pattern, the request is sent to the invoker and the invoker passes it to the encapsulated command object. The command object passes the request to the appropriate method of receiver to perform the specific action.

### Visitor
The visitor pattern is used when we have to perform an operation on a group of similar kinds of objects. With the help of a visitor pattern, we can move the operational logic from the objects to another class.

### Memento
The memento design pattern is used when we want to save the state of an object so that we can restore it later on.

## Miscellaneous
### DAO
The Data Access Object (DAO) design pattern is used to decouple the data persistence logic to a separate layer. DAO is a very popular pattern when we design systems to work with databases. The idea is to keep the service layer separate from the data access layer. This way we implement the separation of logic in our application.

### Dependency Injection
The dependency injection pattern allows us to remove the hard-coded dependencies and make our application loosely-coupled, extendable, and maintainable. We can implement dependency injection in Java to move the dependency resolution from compile-time to runtime.

## References
- https://www.digitalocean.com/community/tutorials/java-design-patterns-example-tutorial