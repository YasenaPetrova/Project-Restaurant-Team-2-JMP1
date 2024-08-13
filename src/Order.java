import Employees.Waiter;
import Restaurant.FoodAndDrink.Drink.Drinks;
import Restaurant.FoodAndDrink.Food.Food;
import Restaurant.FoodAndDrink.Menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Order {
    private  static int nextId=0;
    private int id;
    private double price;
    private double tip;
    private double bill;
    private Waiter waiter;
    private Table table;
    Scanner scanner = new Scanner(System.in);
    List<Food> foods = new ArrayList<>();
    List<Drinks> drinks = new ArrayList<>();

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Order.nextId = nextId;
    }

    public Order(Table table, Waiter waiter) {
        this.id =nextId++;
        this.price = 0;
        this.tip = 0;
        this.bill = 0;
        this.waiter = waiter;
        this.table = table;


    }

    public Table getTable() {
        return this.table;
    }

    public double getTip() {
        return tip;
    }

    public void setTip(double tip) {

        this.tip = tip;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getBill() {
        return bill;
    }

    public void setBill(double bill) {
        this.bill = bill;
    }

    public Waiter getWaiter() {
        return this.waiter;
    }

    public void setWaiter(Waiter waiter) {
        this.waiter = waiter;
    }

    public void addFood(Food item) {
        foods.add(item);
        price += item.getPrice();

    }

    public void addDrink(Drinks item) {
        drinks.add(item);
        price += item.getPrice();

    }

    public void takeOrder(Menu menu) {
        for (int i = 1; i <= table.getNumberTable() ; i++) {
            System.out.println("Do you want to order Food? Yes or No");
            String choiceFood = scanner.nextLine();
            if ("Yes".equalsIgnoreCase(choiceFood)) {
                System.out.println("Please select a food from the menu");
                while (true) {
                    String itemFood = scanner.nextLine();
                    if (itemFood.isEmpty()) {
                        break;
                    }
                    boolean foundFood = false;
                    for (Food food :
                            menu.getFoods()) {
                        if (food.getName().equalsIgnoreCase(itemFood)) {
                            addFood(food);
                            foundFood = true;
                            break;
                        }

                    }
                    if (!foundFood) {
                        System.out.println("Food not found, try again.");
                    }
                }

            }
            System.out.println("Do you want to order Drinks? Yes or No");
            String choiceDrinks = scanner.nextLine();
            if ("Yes".equalsIgnoreCase(choiceDrinks)) {
                System.out.println("Please select a drink from the menu");
                while (true) {
                    String itemDrink = scanner.nextLine();
                    if (itemDrink.isEmpty()) {
                        break;
                    }
                    boolean foundDrink = false;
                    for (Drinks drinks :
                            menu.getDrinks()) {
                        if (drinks.getName().equalsIgnoreCase(itemDrink)) {
                            addDrink(drinks);
                            foundDrink = true;
                            break;
                        }

                    }
                    if (!foundDrink) {
                        System.out.println("Drink not found, try again.");
                    }
                }

            }
        }
    }

    public void calculateTip() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Will you leave a 10% tip? (Yes/No)");
        String tipChoice = scanner.nextLine();
        if (tipChoice.equalsIgnoreCase("yes")) {
            tip = price * 0.1;
            bill = price + tip;
        } else {
            tip = 0;
            bill = price;
        }
        if (waiter != null) {
            waiter.addTips(tip);
            waiter.addTotalOrder(price);
        }
        System.out.printf("Your bill is %.2f $\n", bill);

    }

}

