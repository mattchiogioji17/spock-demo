package com.techexpo.order;

import com.techexpo.menu.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private List<MenuItem> menuItems;
    private Double cost;

    public Order() {
        this.menuItems = new ArrayList<>();
        cost = 0.00;
    }

    public void printOrder() {
        // insert code to print current order to SysOut
        System.out.println("\n-------------  Current Order -------------\n");
        System.out.println("Menu Items:");
        menuItems.forEach(menuItem ->
            System.out.println("\t>> " + menuItem.getName())
        );
        System.out.println("\nOrder Total: " + getCost());

        System.out.println("\n-------------  End of Order -------------");

    }

    public boolean addItem(MenuItem menuItem){
        return menuItems.add(menuItem);
    }


    public boolean removeItem(MenuItem menuItem) {
        if (menuItems.size() == 0) {
            throw new RuntimeException("No MenuItems to remove!");
        }
        return menuItems.remove(menuItem);
    }

    public Double getCost() {
        if (menuItems.isEmpty()) {
            return 0.00;
        }
        menuItems.forEach(menuItem ->
            cost += menuItem.getPrice()
        );
        return cost;
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }


}
