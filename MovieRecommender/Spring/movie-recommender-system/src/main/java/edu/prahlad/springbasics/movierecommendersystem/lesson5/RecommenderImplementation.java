package edu.prahlad.springbasics.movierecommendersystem.lesson5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {

    //use filter interface to select filter
    @Autowired
    private Filter contentBasedFilter;

    public RecommenderImplementation(Filter contentBasedFilter) {
        super();
        this.contentBasedFilter = contentBasedFilter;
    }

    //use a filter to find recommendations
    public String[] recommendedMovies(String movie){
        System.out.println("Name of the filter in use: " + contentBasedFilter + ", for recommending movies similar to " + movie + "\n");
        String[] results = contentBasedFilter.getRecommendations(movie);
        return results;
    }
}
