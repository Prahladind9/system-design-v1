package edu.prahlad.springbasics.movierecommendersystem.lesson12;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS) //with this setup, even after injection into singleton, Movie will be prototype
public class Movie {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    //for keeping track of instances created
    private static int instances = 0;

    private int id;
    private String name;
    private String genre;
    private String producer;

    public Movie(){
        super();
        instances++;
        logger.info("In the movie constructor");
    }

    @PostConstruct
    private void postConstruct(){
        //initialization code
        logger.info("In movie postConstruct method");
    }

    public static int getInstances() {
        return Movie.instances;
    }

    @PreDestroy
    private void preDestroy(){
        //cleanup code
        logger.info("In movie preDestory method");
    }
}
