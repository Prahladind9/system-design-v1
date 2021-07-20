package edu.prahlad.springbasics.movierecommendersystem.lesson4;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ContentBasedFilter implements Filter {
    @Override
    public String[] getRecommendations(String movie) {
        return new String[] {"Finding Nemo", "Ice Age", "Toy Story"};
    }
}
