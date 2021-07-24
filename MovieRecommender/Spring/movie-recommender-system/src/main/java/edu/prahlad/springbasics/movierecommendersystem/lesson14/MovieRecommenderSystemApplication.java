package edu.prahlad.springbasics.movierecommendersystem.lesson14;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

//@SpringBootApplication
@Configuration
@ComponentScan
public class MovieRecommenderSystemApplication {

    public static void main(String[] args) {

        //ApplicationContext manages the beans and dependencies
        /*ApplicationContext applicationContext = SpringApplication.run(
                MovieRecommenderSystemApplication.class
        );*/

        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(MovieRecommenderSystemApplication.class);

        //use ApplicationContext to find which filter is being used
        RecommenderImplementation recommender =
                applicationContext.getBean(RecommenderImplementation.class);

        //call method to get recommendations
        String[] result = recommender.recommendedMovies("Finding Dory");

        //display results
        System.out.println(Arrays.toString(result));

        applicationContext.close();
    }

}
