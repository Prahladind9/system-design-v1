package edu.prahlad.patterns.structural.facade;

import edu.prahlad.patterns.structural.facade.order.OrderFacade;

public class ZRunner {

    public static void main(String[] args) {
        /*//Logic which Client has to implement every time
        OrderProcessor orderProcessor = new OrderProcessor();
        if(orderProcessor.checkStock("Macbook")){
            String orderId=orderProcessor.placeOrder("MacBook", 3);
            orderProcessor.shipOrder(orderId);
        }*/

        OrderFacade orderFacade = new OrderFacade();
        orderFacade.processOrder("Macbook", 3);
    }
}
