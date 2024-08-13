package Restaurant.FoodAndDrink;

import Restaurant.FoodAndDrink.Food.Food;
import Restaurant.FoodAndDrink.Drink.Drinks;
public class Menu {
    public Food[] optionsFood = {};
    public Drinks[] optionsDrinks = {};

    public Menu() {
        this.optionsFood = new Food[9];
        this.optionsDrinks = new Drinks[10];

        this.creation();
    }

    private void creation() {
        this.optionsFood[0] = new Food();
        this.optionsFood[0].setName("Salad");
        this.optionsFood[0].setPortion(350);
        this.optionsFood[0].setPrice(6.5);

        this.optionsFood[1] = new Food();
        this.optionsFood[1].setName("Chicken nuggets");
        this.optionsFood[1].setPortion(250);
        this.optionsFood[1].setPrice(7.5);

        this.optionsFood[2] = new Food();
        this.optionsFood[2].setName("French fries");
        this.optionsFood[2].setPortion(300);
        this.optionsFood[2].setPrice(5.4);

        this.optionsFood[3] = new Food();
        this.optionsFood[3].setName("Chicken breast with mushrooms and sauce");
        this.optionsFood[3].setPortion(400);
        this.optionsFood[3].setPrice(17.95);

        this.optionsFood[4] = new Food();
        this.optionsFood[4].setName("Pork ribs with grilled potatoes");
        this.optionsFood[4].setPortion(350);
        this.optionsFood[4].setPrice(19.05);

        this.optionsFood[5] = new Food();
        this.optionsFood[5].setName("Sushi");
        this.optionsFood[5].setPortion(300);
        this.optionsFood[5].setPrice(20.0);

        this.optionsFood[6] = new Food();
        this.optionsFood[6].setName("Cheesecake");
        this.optionsFood[6].setPortion(150);
        this.optionsFood[6].setPrice(10.75);

        this.optionsFood[7] = new Food();
        this.optionsFood[7].setName("Pancakes");
        this.optionsFood[7].setPortion(250);
        this.optionsFood[7].setPrice(8.45);

        this.optionsFood[8] = new Food();
        this.optionsFood[8].setName("Soufflè with a ball ice cream");
        this.optionsFood[8].setPortion(170);
        this.optionsFood[8].setPrice(13);

        this.optionsDrinks[0] = new Drinks();
        this.optionsDrinks[0].setName("Coffee");
        this.optionsDrinks[0].setLiters(0.075);
        this.optionsDrinks[0].setPrice(2.35);

        this.optionsDrinks[1] = new Drinks();
        this.optionsDrinks[1].setName("Tea");
        this.optionsDrinks[1].setLiters(0.2);
        this.optionsDrinks[1].setPrice(1.2);

        this.optionsDrinks[2] = new Drinks();
        this.optionsDrinks[2].setName("Hot Chocolate");
        this.optionsDrinks[2].setLiters(0.42);
        this.optionsDrinks[2].setPrice(1.9);

        this.optionsDrinks[3] = new Drinks();
        this.optionsDrinks[3].setName("Water");
        this.optionsDrinks[3].setLiters(0.5);
        this.optionsDrinks[3].setPrice(0.95);

        this.optionsDrinks[4] = new Drinks();
        this.optionsDrinks[4].setName("Cola");
        this.optionsDrinks[4].setLiters(0.45);
        this.optionsDrinks[4].setPrice(2.7);

        this.optionsDrinks[5] = new Drinks();
        this.optionsDrinks[5].setName("Juice");
        this.optionsDrinks[5].setLiters(0.35);
        this.optionsDrinks[5].setPrice(2.75);

        this.optionsDrinks[6] = new Drinks();
        this.optionsDrinks[6].setName("Beer");
        this.optionsDrinks[6].setLiters(0.5);
        this.optionsDrinks[6].setPrice(3.05);

        this.optionsDrinks[7] = new Drinks();
        this.optionsDrinks[7].setName("Whiskey");
        this.optionsDrinks[7].setLiters(0.2);
        this.optionsDrinks[7].setPrice(4.2);

        this.optionsDrinks[8] = new Drinks();
        this.optionsDrinks[8].setName("Vodka");
        this.optionsDrinks[8].setLiters(0.2);
        this.optionsDrinks[8].setPrice(2.95);

        this.optionsDrinks[9] = new Drinks();
        this.optionsDrinks[9].setName("Martini");
        this.optionsDrinks[9].setLiters(0.2);
        this.optionsDrinks[9].setPrice(3);
    }

    public Food[] getFoods() {
        return optionsFood;
    }

    public Drinks[] getDrinks() {
        return optionsDrinks;
    }

    public void printFood() {
        for (Food food : optionsFood) {
            if (food != null) {
                System.out.println("Name: " + food.getName());
                System.out.println("Portion: " + food.getPortion());
                System.out.println("Price: " + food.getPrice());
                System.out.println();
            }
        }
    }

    public void printDrinks() {
        for (Drinks drink : optionsDrinks) {
            if (drink != null) {
                System.out.println("Name: " + drink.getName());
                System.out.println("Liters: " + drink.getLiters());
                System.out.println("Price: " + drink.getPrice());
                System.out.println();
            }
        }
    }

    public void printMenu() {
        System.out.printf("\n                  MENU\n");
        System.out.println("\n---------------- DISHES ----------------\n");
        printFood();
        System.out.println("\n---------------- DRINKS ----------------\n");
        printDrinks();
    }
}