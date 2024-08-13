package Restaurant.FoodAndDrink.Drink;
public class AlcoholDrinks extends Drinks {
    public AlcoholDrinks() {
        super();
    }
    public void choiceAlcoholDrink() {
        System.out.println("We can offer You the following alcohol drinks: Beer, Whiskey, Vodka and Martini");
        short choice = scanner.nextShort();
        System.out.println();

        switch (choice) {
            case 1: {
                this.setName("Beer");
                this.setLiters(0.5);
                this.setPrice(3.05);
                this.setStock(10);
                this.decreaseStock();

                break;
            }

            case 2: {
                this.setName("Whiskey");
                this.setLiters(0.2);
                this.setPrice(4.2);
                this.setStock(7);
                this.decreaseStock();

                break;
            }

            case 3: {
                this.setName("Vodka");
                this.setLiters(0.2);
                this.setPrice(2.95);
                this.setStock(15);
                this.decreaseStock();

                break;
            }

            case 4: {
                this.setName("Martini");
                this.setLiters(0.2);
                this.setPrice(3);
                this.setStock(2);
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