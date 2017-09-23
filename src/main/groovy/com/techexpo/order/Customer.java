package com.techexpo.order;

import com.techexpo.menu.MenuItem;

public class Customer {

    private String name;
    private Order order;

    public Customer(String name) {
        this.name = name;
        this.order = new Order();
    }

    public void addItem(MenuItem menuItem) {
        order.addItem(menuItem);
    }

    public void removeItem(MenuItem menuItem) {
        order.removeItem(menuItem);
    }

    public Double getOrderTotal() {
        return order.getCost();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
