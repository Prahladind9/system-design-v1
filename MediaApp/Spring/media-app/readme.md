Media App

_Microservices Intro_
1) MVC: Model View Controller
2) Microservices: complex task is distributed into multiple tasks or services, and each task is developed and managed independently to support business applications
3) SpringBoot: open-source Java-based framework - IoC contianer
    1) Easily configure Java Beans, Database configurations, etc.
    2) Auto Configuration
    3) Easy dependency management
    4) Embedded servlet container
4) Spring Initialzr
5) Bean
   1) Bean is an instance of Java object managed by Spring IOC container
   2) Inversion of Controller (IoC) 
      1) is the process of being provided with objects along with their required dependencies without us creating them
      2) IoC 0 uses Dependency Injection, design pattern to create and bind dependent objects.
6) Annotation
    1) Annotation is a way of passing metadata about a field, class, method, constructor, etc., at compile time.
    2) Scope: Singleton, Prototype, Request, Session, Global Session
    3) @SpringBootApplication
       1) @EnableAutoConfiguration: for auto-configuring the application depending on the dependencies that are added
       2) @SpringBootConfiguration: indicates that the class contains SpringBoot configurations, can be used as an alternative to @Configuration
       3) @ComponentScan: to make SpringBoot aware of the packages that it needs to scan to find all the SpringBoot configuration-annotated classes.
       4) @Bean: method-level configuration annotation
       5) @Autowired: we can annotate a constructor, field, setter method, or config method for Spring IoC to auto-inject the dependency.
       6) @Qualifier: helps to distinguish between multiple beans of the same type, during runtime via dependency injection
         `@Bean("databaseA")
          public DataSource databaseA() { ..... }
          @Bean("databaseB")
          public DataSource databaseB() { ..... }
          @Qualifier("databaseA")
          @Autowired
          public DataSource datasource;`
       7) @Component: generic annotation to annotate class as registered Spring Bean, specialized ones are
          1) @Service: BusinessServiceFacade
          2) @Repository: Database Access Object (DAO), for accessing and manipulating the persisted data
          3) @Controller: web controller containing request handling methods
          4) @RestController: convenience controller, that infers the response body from the return type of the
                              request handling method, instead of handling explicitly for every single method 
          5) @Configuration: for indicating that the annotated class is for configuration or 
                              for holding configuration methods, like @Bean annotated methods
       8) Initialization: Lazy or Eager(default)

7) Configuration Management 
    1) Maintaining Profiles: via application-<profile>.properties
    2) Externalizing configurations
    
8) Spring Data: is a collection of libraries that make it easy for us to access, query and manipulate relational and non-relational databases.
    1) Java ORM: is a programming technique that allows us to store, query and manipulated Java objects stored in relational databases
    2) JPA: Java Persistence API, is a specification that provides us with a collection of classes and methods to store, query, and manipulated data stores in databases.

9) Exception Handling: @ControllerAdvice and @ExceptionHandler 
    