package Restaurant.FoodAndDrink.Drink;

import java.util.Scanner;

public class Drinks {
    private String name;
    private double liters;
    private double price;
    private int stock;

    Scanner scanner = new Scanner(System.in);

    public Drinks() {
        this.name = "";
        this.liters = 0;
        this.price = 0;
        this.stock = 0;
    }

    public String getName() {
        return name;
    }

    public double getLiters() {
        return liters;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLiters(double liters) {
        if(liters < 0)
            this.liters = 0;

        else
            this.liters = liters;
    }

    public void setPrice(double price) {
        if(price < 0)
            this.price = 0;

        else
            this.price = price;
    }
    public void setStock(int stock) {
        if(stock < 0)
            this.stock = 0;

        else this.stock = stock;
    }

    public void decreaseStock() {
        if (this.stock > 0) {
            this.stock--;

            if (this.stock == 0)
                System.out.println("--- SORRY, " + this.getName() + "IS OUT OF STOCK! ---");
        }

        else
            System.out.println("--- SORRY, " + this.getName() + "IS OUT OF STOCK! ---");
    }

    public void print() {
        System.out.println("Name of drink: " + this.getName() + "\nLiters: " + this.getLiters() + "\nPrice: " + this.getPrice() + "\nAmount left: " + this.getStock() + '\n');
        System.out.println("\n\n");
    }
}