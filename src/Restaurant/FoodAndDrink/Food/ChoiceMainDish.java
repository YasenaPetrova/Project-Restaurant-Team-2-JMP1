package Restaurant.FoodAndDrink.Food;
import Restaurant.FoodAndDrink.Product;

public class ChoiceMainDish extends Food {
    public ChoiceMainDish() {
        super();
    }

    public void choiceMainDish(){
        System.out.println("What would you like better:\n1. Chicken breast with mushrooms and sauce\n2. Pork ribs with grilled potatoes\n3. Sushi");
        short choice = scanner.nextShort();
        System.out.println();

        switch (choice) {
            case 1: {
                this.setName("Chicken breast with mushrooms and sauce");
                this.setPortion(400);
                this.setPrice(17.95);
                this.product = new Product("Chicken breast with mushrooms and sauce");
                this.print();

                break;
            }

            case 2: {
                this.setName("Pork ribs with grilled potatoes");
                this.setPortion(350);
                this.setPrice(19.05);
                this.product = new Product("Pork ribs with grilled potatoes");
                this.print();

                break;
            }

            case 3: {
                this.setName("Sushi");
                this.setPortion(300);
                this.setPrice(20.0);
                this.product = new Product("Sushi");
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
