package edu.prahlad.patterns.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerImpl implements Customer{

    // we are taking responsibility of object creation
    //CreditCard creditCard = new CreditCardImpl();

    //Field Injection
//    @Autowired
//    CreditCard creditCard;


    //Setter Injection
    /*CreditCard creditCard;

    @Autowired
    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }*/


    //Constructor Injection
    CreditCard creditCard;

    @Autowired
    public CustomerImpl(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    @Override
    public void pay() {
        creditCard.makePayment();
    }
}
