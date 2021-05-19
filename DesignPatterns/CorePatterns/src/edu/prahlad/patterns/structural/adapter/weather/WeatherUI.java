package edu.prahlad.patterns.structural.adapter.weather;

public class WeatherUI {
    public void showTemperatureUsingAdapter(String city){
        WeatherFinder weatherFinder = new WeatherFinderImpl();
        System.out.println(weatherFinder.findCity(city));
    }

    public void showTemperatureUsingAdapter(int zipCode){
        WeatherAdapter weatherFinder = new WeatherAdapter();
        System.out.println(weatherFinder.findTemperature(zipCode));
    }
}
