package com.techexpo.menu.drink;

import com.techexpo.menu.MenuItem;

import java.math.BigDecimal;

public class Water extends MenuItem {

    public Water() {
        super.name = "Water";
        super.price = BigDecimal.valueOf(1.99);
        super.calories = 0;
        super.carbs = 0;
        super.fat = 0;
        super.sugar = 0;
    }
}
