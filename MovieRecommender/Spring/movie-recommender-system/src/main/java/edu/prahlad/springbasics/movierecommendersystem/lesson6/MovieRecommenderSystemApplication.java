package edu.prahlad.springbasics.movierecommendersystem.lesson6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

    public static void main(String[] args) {

        //ApplicationContext manages the beans and dependencies
        ApplicationContext applicationContext = SpringApplication.run(
                MovieRecommenderSystemApplication.class
        );

        //use ApplicationContext to find which filter is being used
        RecommenderImplementation recommender =
                applicationContext.getBean(RecommenderImplementation.class);

        //call method to get recommendations
        String[] result = recommender.recommendedMovies("Finding Dory");

        //display results
        System.out.println(Arrays.toString(result));
    }

}
