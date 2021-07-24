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

Manage Objects and dependencies
    Autowiring by Type - @Primary
    Autowiring by Name 
    Autowiring - @Qualifier
    Note: @Qualifier takes precedence over the @Primary annotation
    Constructor Injection (CI) and Setter Injection (SJ)
        1) SJ is used to avoid the "BeanCurrentlyInCreationException" 
            raised in case of circular dependency, 
            because unlike CI where dependencies are injected at the time when the context is loaded,
            SJ injects dependencies when they are needed.
        2) CI ensures that all dependencies are injected because an object
            cannot be constructed until all its dependencies are available.
            CI ensures immutability as the state of the bean cannot be modified after creation

Scope
    any application      > Singleton, Prototype
    only web application > Request, Session, Application, Websocket  

Singleton - Spring vs Gang of Four 
    Singleton design by GoF means one bean per JVM
    In Spring singleton mean one bean per application context,
        for one JVM there may be many application context's

When a prototype bean is injected into a singleton bean, by default,
it loses its prototype behaviour and acts as a singleton
Note: 1) Singleton scope minimizes the no of objects created, 
         so the scope should only be changed where necessary.
      2) If there are more objects, there will be an impact on the 
         memory used as well as on garbage collection

PostConstruct > is called when all dependencies are resolved
PreDestroy    > callback method that is executed just before the bean is destroyed 
PrototypeBeans
    spring container creates the prototype beans and hands them over when requested.
    thereafter, it is the responsibility of the application to destroy the bean and free up any resources that it has acquired.
    hence, the preDestroy method is not called

Contexts and Dependency Injection Framework
@Component ~ @Named
@Autowired ~ @Inject