package edu.prahlad.springbasics.movierecommendersystem.lesson9;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)//default one
public class ContentBasedFilter implements Filter {
    //for keeping track of instances created
    private static int instances = 0;

    @Autowired
    private Movie movie;

    public ContentBasedFilter(Movie movie) {
        super();
        instances++;
        this.movie = movie;
        System.out.println("ContentBasedFilter constructor called");
    }

//    @Lookup
    public Movie getMovie() {
        return movie;
    }

    public static int getInstances() {
        return ContentBasedFilter.instances;
    }

    @Override
    public String[] getRecommendations(String movie) {
        return new String[] {"Finding Nemo", "Ice Age", "Toy Story"};
    }
}
