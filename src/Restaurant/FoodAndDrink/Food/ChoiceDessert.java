package Restaurant.FoodAndDrink.Food;

import Restaurant.FoodAndDrink.Product;

public class ChoiceDessert extends Food {
    public ChoiceDessert() {
        super();
    }

    public void choiceDessert() {
        System.out.println("What would you like better:\n1. Cheesecake\n2. Pancakes\n3. Soufflè with a ball ice cream");
        short choice = scanner.nextShort();
        System.out.println();

        switch (choice) {
            case 1: {
                this.setName("Cheesecake");
                this.setPortion(150);
                this.setPrice(10.75);
                this.product = new Product("Cheesecake");
                this.print();

                break;
            }

            case 2: {
                this.setName("Pancakes");
                this.setPortion(250);
                this.setPrice(8.45);
                this.product = new Product("Pancakes");
                this.print();

                break;
            }

            case 3: {
                this.setName("Soufflè with a ball ice cream");
                this.setPortion(170);
                this.setPrice(13);
                this.product = new Product("Soufflè with a ball ice cream");
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