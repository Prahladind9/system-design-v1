package edu.prahlad.facebook;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class FacebookApplication extends SpringBootServletInitializer
        implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(FacebookApplication.class);

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(FacebookApplication.class);
    }
    public static void main(String[] args) {
        SpringApplication.run(FacebookApplication.class, args);
    }

    @Override
    public void run(String... args) {
        log.info("Start FacebookApplication...");
    }

}
