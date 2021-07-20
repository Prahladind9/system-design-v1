package edu.prahlad.springbasics.movierecommendersystem.lesson7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {

    private Filter filter;

    @Autowired
    public RecommenderImplementation(@Qualifier("collaborativeFilter") Filter filter) {
        super();
        this.filter = filter;
        System.out.println("Constructor invoked...");
    }

    //use a filter to find recommendations
    public String[] recommendMovies(String movie){
        System.out.println("Name of the filter in use: " + filter + ", for recommending movies similar to " + movie + "\n");
        String[] results = filter.getRecommendations(movie);
        return results;
    }
}
