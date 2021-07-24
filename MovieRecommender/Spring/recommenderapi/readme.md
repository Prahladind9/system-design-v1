SpringBoot
    1) enables robust creation of applications, provides features like servers, metrics, health checks
    2) has autoconfiguration, internationalization, starter projects, external config, dev tools, actuator
        examples: spring-boot- starter-web, starter-test, starter-data-jpa, devtools, starter-actuator & HAL browser
        1) web: @RestController, @GetMapping/@RequestMapping
        2) devtools: Automatic restart > LiveReload, RestartClassLoader
        3) HAL browser: An API browser for the hal+json media type
            ex: http://localhost:8080/browser/index.html#/
        4) actuator: feature that provides monitoring features for the application during development & after deployment 
                1) /auditevents: shows audit information like which users were validates, or how many users failed the authentication test, etc
                2) /beans: shows all the sprig beans that are configured - name, scope, type of bean
                3) /condition: +, -ve matches for the autoconfiguration similar to the report generated at application startup
                4) /httptrace: shows the last 100 requests that were executed along with the response that was sent back
                5) /mappings: shows all the URI's for @RequestMapping
                6) /metrics: shows a list of valid metrics
                7) /shutdown: when enabled, lets the application gracefully shutdown
            ex: http://localhost:8081/actuator/beans