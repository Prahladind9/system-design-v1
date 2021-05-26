package edu.prahlad.patterns.structural.proxy.virtual;

import java.util.ArrayList;
import java.util.List;

public class CustomerProxyImpl implements Customer{
    final CustomerImpl customer = new CustomerImpl();
    @Override
    public int getId() {
        return customer.getId();
    }

    @Override
    public List<Order> getOrders() {
        final ArrayList<Order> orders = new ArrayList<Order>();
        final Order order1 = new Order();
        order1.setId(1);
        order1.setProductName("Iphone");
        order1.setQuantity(100);

        final Order order2 = new Order();
        order2.setId(2);
        order2.setProductName("Mac");
        order2.setQuantity(100);

        orders.add(order2);
        return orders;
    }
}
