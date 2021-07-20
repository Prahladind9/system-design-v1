package edu.prahlad.springbasics.movierecommendersystem.lesson2;

public class ContentBasedFilter implements Filter{
    @Override
    public String[] getRecommendations(String movie) {
        return new String[] {"Finding Nemo", "Ice Age", "Toy Story"};
    }
}
