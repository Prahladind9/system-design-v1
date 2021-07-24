package edu.prahlad.springbasics.movierecommendersystem.lesson11;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@SpringBootApplication
@ComponentScan(basePackages = {"edu.prahlad.springbasics.movierecommendersystem.lesson10"})
@ComponentScan(includeFilters = @ComponentScan.Filter(
        type = FilterType.REGEX,
        pattern = "edu.prahlad.springbasics.movierecommendersystem.lesson9.*"))
public class MovieRecommenderSystemApplication {

    public static void main(String[] args) {

        //ApplicationContext manages the beans and dependencies
        ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);

        //use ApplicationContext to get recommender object
        RecommenderImplementation recommender = appContext.getBean(RecommenderImplementation.class);
        System.out.println(recommender);
    }

}
