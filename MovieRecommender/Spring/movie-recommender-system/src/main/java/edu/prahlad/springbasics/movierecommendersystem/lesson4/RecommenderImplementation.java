package edu.prahlad.springbasics.movierecommendersystem.lesson4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {

    //use filter interface to select filter
    @Autowired
    private Filter filter;

    public RecommenderImplementation(Filter filter) {
        super();
        this.filter = filter;
    }

    //use a filter to find recommendations
    public String[] recommendedMovies(String movie){
        System.out.println("Name of the filter in use: " + filter + ", for recommending movies similar to " + movie + "\n");
        String[] results = filter.getRecommendations(movie);
        return results;
    }
}
