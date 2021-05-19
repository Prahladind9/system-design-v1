package edu.prahlad.patterns.structural.adapter.weather;

public class WeatherFinderImpl implements WeatherFinder{
    @Override
    public int findCity(String city) {
        return 33;//can be derived from DB or any external source
    }
}
