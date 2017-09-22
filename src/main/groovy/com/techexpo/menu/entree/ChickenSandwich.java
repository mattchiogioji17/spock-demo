package com.techexpo.menu.entree;

import com.techexpo.menu.MenuItem;

import java.math.BigDecimal;

public class ChickenSandwich extends MenuItem {

    public ChickenSandwich() {
        super.name = "Chick-fil-A Chicken Sandwich";
        super.price = BigDecimal.valueOf(3.05);
        super.calories = 440;
        super.carbs = 40;
        super.fat = 19;
        super.protein = 28;
        super.sugar = 5;
    }
}
