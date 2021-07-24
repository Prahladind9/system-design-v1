package edu.prahlad.springbasics.movierecommendersystem.lesson14;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CollaborativeFilter implements Filter {

    public String[] getRecommendations(String movie){
        //logic of collaborative filter
        return new String[] {};
     }
}
