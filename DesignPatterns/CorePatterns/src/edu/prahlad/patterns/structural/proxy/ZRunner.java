package edu.prahlad.patterns.structural.proxy;

import edu.prahlad.patterns.structural.proxy.virtual.Customer;
import edu.prahlad.patterns.structural.proxy.virtual.CustomerImpl;
import edu.prahlad.patterns.structural.proxy.virtual.CustomerProxyImpl;

public class ZRunner {

    public static void main(String[] args) {
        Customer customer = new CustomerImpl();
        System.out.println(customer.getId());
        System.out.println(customer.getOrders());

        Customer customerProxy = new CustomerProxyImpl();
        System.out.println(customerProxy.getId());
        System.out.println(customerProxy.getOrders());
    }
}
