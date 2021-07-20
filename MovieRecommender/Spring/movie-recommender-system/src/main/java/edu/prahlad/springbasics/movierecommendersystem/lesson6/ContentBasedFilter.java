package edu.prahlad.springbasics.movierecommendersystem.lesson6;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component("CBF")
//or
@Component
@Qualifier("CBF")
public class ContentBasedFilter implements Filter {
    @Override
    public String[] getRecommendations(String movie) {
        return new String[] {"Finding Nemo", "Ice Age", "Toy Story"};
    }
}
