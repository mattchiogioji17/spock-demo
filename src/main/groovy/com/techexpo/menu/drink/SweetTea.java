package com.techexpo.menu.drink;

import com.techexpo.menu.MenuItem;

import java.math.BigDecimal;

public class SweetTea extends MenuItem {

    public SweetTea() {
        super.name = "Sweet Tea";
        super.price = BigDecimal.valueOf(1.59);
        super.calories = 220;
        super.carbs = 57;
        super.fat = 0;
        super.protein = 0;
        super.sugar = 57;
    }
}
