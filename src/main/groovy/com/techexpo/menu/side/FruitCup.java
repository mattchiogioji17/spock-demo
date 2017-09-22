package com.techexpo.menu.side;

import com.techexpo.menu.MenuItem;

import java.math.BigDecimal;

public class FruitCup extends MenuItem {

    public FruitCup() {
        super.name = "Fruit Cup";
        super.price = BigDecimal.valueOf(2.75);
        super.calories = 80;
        super.carbs = 21;
        super.fat = 0;
        super.protein = 1;
        super.sugar = 16;
    }
}
