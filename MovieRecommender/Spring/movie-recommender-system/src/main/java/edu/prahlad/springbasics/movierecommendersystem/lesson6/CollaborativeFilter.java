package edu.prahlad.springbasics.movierecommendersystem.lesson6;

import org.springframework.beans.factory.annotation.Qualifier;
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
