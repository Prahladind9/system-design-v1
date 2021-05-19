package edu.prahlad.patterns.structural.adapter;

import edu.prahlad.patterns.structural.adapter.payment.PaymentAdapter;
import edu.prahlad.patterns.structural.adapter.payment.PaymentApp;
import edu.prahlad.patterns.structural.adapter.weather.WeatherUI;

public class ZRunner {
    public static void main(String[] args) {
        WeatherUI weatherUI = new WeatherUI();
        weatherUI.showTemperatureUsingAdapter(522303);
        weatherUI.showTemperatureUsingAdapter("Bangalore");

        PaymentApp paymentApp = new PaymentApp();
        paymentApp.pay(100);
        paymentApp.payUsingAdapter(100, "rupees");
    }
}
