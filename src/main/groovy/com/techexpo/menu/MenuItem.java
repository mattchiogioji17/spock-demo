package com.techexpo.menu;

public abstract class MenuItem {

    public String name;

    public int calories;
    public int fat;
    public int carbs;
    public int sugar;
    public int protein;

    public Double price;

    public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }

    public int getFat() {
        return fat;
    }

    public int getCarbs() {
        return carbs;
    }

    public int getSugar() {
        return sugar;
    }

    public Double getPrice() {
        return price;
    }

    public int getProtein() {
        return protein;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MenuItem menuItem = (MenuItem) o;

        if (calories != menuItem.calories) return false;
        if (fat != menuItem.fat) return false;
        if (carbs != menuItem.carbs) return false;
        if (sugar != menuItem.sugar) return false;
        if (protein != menuItem.protein) return false;
        if (!name.equals(menuItem.name)) return false;
        return price.equals(menuItem.price);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + price.hashCode();
        return result;
    }
}
