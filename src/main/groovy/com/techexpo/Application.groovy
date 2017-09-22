package com.techexpo

import com.techexpo.menu.drink.SweetTea
import com.techexpo.menu.entree.ChickenSandwich
import com.techexpo.menu.side.Fries
import com.techexpo.menu.MenuItem
import com.techexpo.order.Customer

class Application {

    public static void main(String[] args) {
        Customer customer = new Customer("Jamie Dimon", 60);
        MenuItem chickenSandwich = new ChickenSandwich();
        MenuItem sweetTea = new SweetTea();
        MenuItem fries = new Fries();
        customer.addItem(chickenSandwich);
        customer.addItem(chickenSandwich);
        customer.addItem(sweetTea);
        customer.addItem(fries);
        customer.removeItem(chickenSandwich);
        customer.order.printOrder();

    }
}
