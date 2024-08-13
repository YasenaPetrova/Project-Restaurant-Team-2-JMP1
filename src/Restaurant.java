import Restaurant.FoodAndDrink.Food.Food;
import Restaurant.FoodAndDrink.Menu;

import java.util.Scanner;

public class Restaurant {
    private String name;
    private int stars;
    private double capital;

    Menu menu = new Menu();

    public Restaurant() {
        this.name = "JavaBite";
        this.stars = 2;
        this.capital = 15000.0;

    }

    public Restaurant(String name, int stars, double capital) {
        setName(name);
        setStars(stars);
        setCapital(capital);
    }

    public Restaurant(Restaurant other) {
        this.name = other.name;
        this.stars = other.stars;
        this.capital = other.capital;
    }

    public String getName() {
        return this.name;
    }

    public int getStars() {
        return this.stars;
    }

    public double getCapital() {
        return capital;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setName(String name) {
        if ('A' <= name.charAt(0) && name.charAt(0) <= 'Z')
            this.name = name;

        else {
            name = Character.toUpperCase(name.charAt(0)) + name.substring(1);
            this.name = name;
        }
    }

    public void setStars(int stars) {
        if (stars < 0 || 5 < stars)
            this.stars = 0;

        else
            this.stars = stars;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public void setCapital(double capital) {
        if (this.capital < 0 || this.capital < 4000)
            this.capital = 4000;

        else
            this.capital = capital;
    }
}