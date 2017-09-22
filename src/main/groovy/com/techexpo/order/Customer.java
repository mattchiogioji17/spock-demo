package com.techexpo.order;

import com.techexpo.menu.MenuItem;

import java.math.BigDecimal;

public class Customer {

    private String name;
    private int age;

    private Order order;

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
        this.order = new Order();
    }

    public void addItem(MenuItem menuItem) {
        order.addItem(menuItem);
    }

    public void removeItem(MenuItem menuItem) {
        order.removeItem(menuItem);
    }

    public BigDecimal getOrderTotal() {
        return null;
    }

    public void printNutritionFacts() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
