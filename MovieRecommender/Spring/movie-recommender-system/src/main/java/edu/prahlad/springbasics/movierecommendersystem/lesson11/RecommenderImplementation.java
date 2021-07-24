package edu.prahlad.springbasics.movierecommendersystem.lesson11;

import edu.prahlad.springbasics.movierecommendersystem.lesson8.Filter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class RecommenderImplementation {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private Filter filter;

    @Autowired
    public void setFilter(Filter filter) {
        logger.info("In RecommenderImplementation setter method .. dependency injection");
        this.filter = filter;
    }

    @PostConstruct
    public void postConstruct(){
        //initialization code goes here
        logger.info("In RecommenderImplementation postConstruct method");
    }

    //use a filter to find recommendations
    public String[] recommendMovies(String movie){
        System.out.println("Name of the filter in use: " + filter + ", for recommending movies similar to " + movie + "\n");
        String[] results = filter.getRecommendations(movie);
        return results;
    }

    @PreDestroy
    public void preDestroy(){
        //cleanup code
        logger.info("In RecommenderImplementation preDestroy method");
    }
}
