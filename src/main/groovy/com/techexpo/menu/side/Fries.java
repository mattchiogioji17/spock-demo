package com.techexpo.menu.side;

import com.techexpo.menu.MenuItem;

import java.math.BigDecimal;

public class Fries extends MenuItem {

    public Fries() {
        super.name = "Waffle Fries";
        super.price = BigDecimal.valueOf(1.65);
        super.calories = 520;
        super.carbs = 63;
        super.fat = 27;
        super.protein = 6;
        super.sugar = 0;
    }
}
