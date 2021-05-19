package edu.prahlad.patterns.structural.adapter.weather;

public class WeatherAdapter {
    public int findTemperature(int zipCode){
        String city = null;
        if(zipCode == 522303){
            city = "Vijayawada";
        }
        WeatherFinder weatherFinder = new WeatherFinderImpl();
        int temperature = weatherFinder.findCity(city);
        return temperature;
    }
}
