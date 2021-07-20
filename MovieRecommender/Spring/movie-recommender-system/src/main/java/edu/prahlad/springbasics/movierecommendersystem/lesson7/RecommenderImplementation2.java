package edu.prahlad.springbasics.movierecommendersystem.lesson7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation2 {

    private Filter filter;

    @Autowired
    @Qualifier("contentBasedFilter")
    public void setFilter(Filter filter) {
        this.filter = filter;
        System.out.println("Setter method invoked..");
    }

    //use a filter to find recommendations
    public String[] recommendMovies(String movie){
        System.out.println("Name of the filter in use: " + filter + ", for recommending movies similar to " + movie + "\n");
        String[] results = filter.getRecommendations(movie);
        return results;
    }
}
