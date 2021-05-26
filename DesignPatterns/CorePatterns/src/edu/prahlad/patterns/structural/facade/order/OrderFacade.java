package edu.prahlad.patterns.structural.facade.order;

public class OrderFacade {
    OrderProcessor orderProcessor = new OrderProcessor();
    public void processOrder(String name, int quantity){
        if(orderProcessor.checkStock(name)) {
            String orderId = orderProcessor.placeOrder(name, quantity);
            orderProcessor.shipOrder(orderId);
        }
    }
}
