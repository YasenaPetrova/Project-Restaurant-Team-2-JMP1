package Restaurant.FoodAndDrink.Drink;

public class ColdDrinks extends Drinks {
    public ColdDrinks() {
        super();
    }

    public void choiceColdDrink() {
        System.out.println("We can offer You the following cold drinks: Water, Cola, Juice");
        short choice = scanner.nextShort();
        System.out.println();

        switch (choice) {
            case 1: {
                this.setName("Water");
                this.setLiters(0.5);
                this.setPrice(0.95);
                this.setStock(21);
                this.decreaseStock();

                break;
            }

            case 2: {
                this.setName("Cola");
                this.setLiters(0.45);
                this.setPrice(2.7);
                this.setStock(15);
                this.decreaseStock();

                break;
            }

            case 3: {
                this.setName("Juice");
                this.setLiters(0.35);
                this.setPrice(2.75);
                this.setStock(14);
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