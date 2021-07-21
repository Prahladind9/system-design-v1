package edu.prahlad.springbasics.movierecommendersystem.lesson9;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) //with this setup, injection into singleton will make Movie singleton
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) //with this setup, injection into singleton will make Movie singleton and with @Lookup
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS) //with this setup, even after injection into singleton, Movie will be prototype
public class Movie {
    //for keeping track of instances created
    private static int instances = 0;

    private int id;
    private String name;
    private String genre;
    private String producer;

    public Movie(){
        super();
        instances++;
        System.out.println("Movie constructor called");
    }

    public static int getInstances() {
        return Movie.instances;
    }
}
