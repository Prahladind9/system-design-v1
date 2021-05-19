package edu.prahlad.patterns.structural.adapter.payment;

public class PaymentApp {

    public void pay(int dollars){
        PaymentProcessorImpl paymentProcessor = new PaymentProcessorImpl();
        paymentProcessor.pay(dollars);
    }

    public void payUsingAdapter(int amount, String currency){
        if(currency.equals("USD")){
            this.pay(amount);
        }else if(currency.equals("rupees")){
            PaymentAdapter paymentAdapter = new PaymentAdapter();
            paymentAdapter.convertAndPayInDollars(amount);
        }
    }
}
