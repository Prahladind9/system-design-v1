Loosely Coupled system 
    we use an interface > implement the logic/contract
    initialize the interface object via constructor

Spring automates the above process of creating objects and binding them together.
Spring take responsibility of creating instances of classes and binding
instances based on their dependencies.
The instances or objects that Spring manages are called beans.

Spring requires information about 3 things to manage objects and dependencies
1) Beans
2) Dependencies
3) Location of beans

Autowiring by Type - @Primary
Autowiring by Name 
Autowiring - @Qualifier

@Qualifier takes precedence over the @Primary annotation
