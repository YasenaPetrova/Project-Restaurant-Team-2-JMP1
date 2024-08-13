package Restaurant.FoodAndDrink;

import java.util.HashMap;

public class Product {
    private static HashMap<String, Integer> productQuantity = new HashMap<>();
    private static HashMap<String, String> productName = new HashMap<>();

    private String nameOfObject;

    public Product() {
    }

    public Product(String name) {
        this.nameOfObject = name;
        this.setName(name);
        this.setAmount(name);
        this.minusOneProduct();
    }

    public String getName() {
        return productName.getOrDefault(this.nameOfObject, "");
    }

    public int getAmount() {
        return productQuantity.getOrDefault(this.nameOfObject, 0);
    }

    public String getNameOfObject() {
        return this.nameOfObject;
    }

    public void setName(String name) {
        if (!productName.containsKey(name))
            productName.put(name, getInitialName(name));
    }

    public void setAmount(String name) {
        if (!productQuantity.containsKey(name))
            productQuantity.put(name, getInitialQuantity(name));
    }

    public void setNameOfObject(String name) {
        if (!productQuantity.containsKey(name))
            productQuantity.put(name, 0);
    }

    private int getInitialQuantity(String name) {
        switch (name) {
            case "Salad":
                return 0;

            case "Chicken nuggets":
                return 10;

            case "French Fries":
                return 15;

            case "Chicken breast with mushrooms and sauce":
                return 13;

            case "Pork ribs with grilled potatoes":
                return 2;

            case "Sushi":
                return 5;

            case "Cheesecake":
                return 7;

            case "Pancake":
                return 3;

            case "Soufflè with a ball ice cream":
                return 6;

            default:
                return 0;
        }
    }

    private String getInitialName(String name) {
        switch (name) {
            case "Salad":
                return "Tomatoes, Cucumber, Lettuce, Corn";

            case "Chicken nuggets":
                return "Chicken";

            case "French Fries":
                return "Potatoes";

            case "Chicken breast with mushrooms and sauce":
                return "Chicken, Mushrooms";

            case "Pork ribs with grilled potatoes":
                return "Pork ribs, Sweet Potatoes";

            case "Sushi":
                return "Salmon, Rice";

            case "Cheesecake":
                return "Cream Cheese and Cookies";

            case "Pancake":
                return "Flour, Eggs, Chocolate";

            case "Soufflè with a ball ice cream":
                return "Chocolate, Ice cream balls";

            default:
                return "";
        }
    }

    public void minusOneProduct() {
        if (productQuantity.containsKey(this.nameOfObject)) {
            int quantity = productQuantity.get(this.nameOfObject);

            if (quantity > 0) {
                productQuantity.put(this.nameOfObject, quantity - 1);
                System.out.println(this.nameOfObject + " has been ordered.");
                quantity--;
            }

            else
                System.out.println("--- SORRY, " + this.nameOfObject + " IS OUT OF STOCK! ---");
        }
    }
}
