package edu.prahlad.springbasics.movierecommendersystem.lesson11;

import edu.prahlad.springbasics.movierecommendersystem.lesson8.Filter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class ContentBasedFilter implements Filter {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public ContentBasedFilter() {
        super();
        logger.info("In ContentBasedFilter constructor method");
    }

    @PostConstruct
    private void postConstruct(){
        //load movies into cache
        logger.info("In ContentBasedFilter postConstruct method");
    }

    @Override
    public String[] getRecommendations(String movie) {
        return new String[] {"Finding Nemo", "Ice Age", "Toy Story"};
    }

    @PreDestroy
    private void preDestroy(){
        //clear movies from cache
        logger.info("In ContentBasedFilter preDestroy method");
    }
}
