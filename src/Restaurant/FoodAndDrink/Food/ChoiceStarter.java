package Restaurant.FoodAndDrink.Food;
import Restaurant.FoodAndDrink.Product;

public class ChoiceStarter extends Food {
    public ChoiceStarter() {
        super();
    }

    public void choiceStarter(){
        System.out.println("What would you like better:\n1. Salad\n2. Chicken nuggets\n3. French fries");
        short choice = scanner.nextShort();
        System.out.println();

        switch (choice) {
            case 1: {
                this.setName("Salad");
                this.setPortion(350);
                this.setPrice(6.5);
                this.product = new Product("Salad");
                this.print();
                break;
            }

            case 2: {
                this.setName("Chicken nuggets");
                this.setPortion(250);
                this.setPrice(7.5);
                this.product = new Product("Chicken nuggets");
                this.print();
                break;
            }

            case 3: {
                this.setName("French fries");
                this.setPortion(300);
                this.setPrice(5.4);
                this.product = new Product("French fries");
                this.print();
                break;
            }

            default: {
                System.out.println("Something went wrong");
                break;
            }
        }
    }
}