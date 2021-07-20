package edu.prahlad.springbasics.movierecommendersystem.lesson1;

public class RecommenderImplementation {

    //content-based filtering technique

    public String[] recommendedMovies(String movie){
        //use content based filter to find similar movies
        //Tight Coupling
        ContentBasedFilter filter = new ContentBasedFilter();
        String[] results = filter.getRecommendations("Finding Dory");
        //return the results
        return results;
    }
}
