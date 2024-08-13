package Restaurant.FoodAndDrink.Drink;

public class HotDrinks extends Drinks {
    public HotDrinks() {
        super();
    }
    public void choiceHotDrink() {
        System.out.println("We can offer You the following hot drinks: Coffee, Tea, Hot Chocolate");
        short choice = scanner.nextShort();
        System.out.println();

        switch (choice) {
            case 1: {
                this.setName("Coffee");
                this.setLiters(0.075);
                this.setPrice(2.35);
                this.setStock(16);
                this.decreaseStock();

                break;
            }

            case 2: {
                this.setName("Tea");
                this.setLiters(0.2);
                this.setPrice(1.2);
                this.setStock(7);
                this.decreaseStock();

                break;
            }

            case 3: {
                this.setName("Hot Chocolate");
                this.setLiters(0.42);
                this.setPrice(1.9);
                this.setStock(9);
                this.decreaseStock();

                break;
            }

            default: {
                System.out.println("Something went wrong");
                break;
            }
        }
    }
}