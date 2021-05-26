package edu.prahlad.patterns.structural.facade.order;

public class OrderProcessor {
    public boolean checkStock(String name){
        System.out.println("Checking stock");
        return true;
    }

    public String placeOrder(String name, int quantity){
        System.out.println("Order Placed");
        return "123ab";
    }

    public void shipOrder(String orderId){
        System.out.println("Order Shipped");
    }
}
