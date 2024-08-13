package Restaurant.FoodAndDrink.Food;
import Restaurant.FoodAndDrink.Product;
import java.util.Scanner;
public class Food {
    private String name;
    private int portion;
    private double price;
    Product product;

    Scanner scanner = new Scanner(System.in);

    public Food() {
        this.product = new Product();
    }

    public String getName() {
        return this.name;
    }

    public int getPortion() {
        return this.portion;
    }

    public double getPrice() {
        return this.price;
    }

    public void setName(String name1) {
        this.name = name1;
    }

    public void setPortion(int portion1) {
        this.portion = portion1;
    }

    public void setPrice(double price1) {
        this.price = price1;
    }

    public Product getProduct() {
        return this.product;
    }

    public void print() {
        System.out.println("Choice: " + this.getName() + "\nDish portion: " + this.getPortion() + "\nPrice: " + this.getPrice() + '\n');
        System.out.println("Product: " + this.product.getName() + "\nAmount left: " + this.product.getAmount() + '\n');
    }
}