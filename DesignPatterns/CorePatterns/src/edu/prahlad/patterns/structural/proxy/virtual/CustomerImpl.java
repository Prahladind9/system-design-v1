package edu.prahlad.patterns.structural.proxy.virtual;

import java.util.List;

public class CustomerImpl implements Customer{
    private int id;
    private List<Order> orders;

    public CustomerImpl() {
        this.id = 123;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public List<Order> getOrders() {
        return this.orders;
    }
}
