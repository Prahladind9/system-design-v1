Design Pattern
Helps Identify recurring problem & provides a ready to use solution for that problem
Solution - Problem - Context

Capture design experience
Promotes reuse without having to reinvent the wheel
Define the system structure better
Provide a common design language between developers

GOF Pattern Catalog
    Creational Patterns: Singleton, Factory, Abstract Factory, Builder, Prototype ...
        provides guidelines to instantiate a single or group of objects
    Structural Patterns: Adapter, Bridge, Flyweight, Decorator, Proxy ...
        provide a manner to define relationships between classes
    Behavioural Patterns: Command, Interpreter, Template Method, Observer, Visitor ...
        define how the communication should happen among classes and objects

JEE Pattern Catalog
    Organised: Presentation, Integration > Service > Data Access Layer
    Presentation Layer: Intercepting Filter, Front Controller, MVC, Context Object ...
    Integration Layer: Service Activator, Web Service Broker ...
    Business Layer: Business Delegate, Transfer Object, Session Facade, Service Locator ...
    Data Access Layer: Data Access Object ...

    Layer Architecure > Simplicity, Separation of concerns, Easy Maintenance 	

Dependency Injection
	is a mechanism of providing a dependency to a class, 
	which it needs it dynamically at runtime by creating a object of that type.
	HAS-A relation

	Example: Service class using repo to fetch data.

InversionOfControl
	is the process of asking an external container to 
	create an object and to inject it at runtime.
	Ex: SpringBoot

        
