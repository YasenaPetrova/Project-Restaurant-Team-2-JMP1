import Employees.Waiter;
import Restaurant.FoodAndDrink.Menu;

import java.util.ArrayList;
import java.util.List;

public class Table {
    private static int nextId = 0;
    private int id;
    private static final int TABLE = 11;

    private int customers;
    private int group;
    private int numberTable = 1;
    private double totalBill = 0;
    private Waiter waiter;
    private List<Order> orders = new ArrayList<>();


    public Table(Waiter waiter) {
        this.id = nextId++;
        this.waiter = waiter;
    }

    public int getId() {
        return id;
    }


    public int getNumberTable() {
        return numberTable;
    }

    public int getNextId() {
        return nextId;
    }

    public void setNextId(int nextId) {
        this.nextId = nextId;
    }

    public double gettotalBill() {
        return totalBill;
    }

    public void addTotalBill(double orderPrice) {
        this.totalBill += orderPrice;
    }

    public void addOrder(Order order) {
        this.orders.add(order);
        this.totalBill += order.getBill();
    }

    public Waiter getWaiter() {
        return waiter;
    }

    public int Seats() {
        int min = 15;
        int max = 100;
        int availableSeats = 82;
        this.customers = (int) Math.floor(Math.random() * (max - min + 1) + min);
        System.out.printf("Customers for the day: %d \n", this.customers);
        System.out.println();
        while (this.customers > 0) {
            int minGroup = 1;
            int maxGroup = 8;

            this.group = (int) Math.floor(Math.random() * (maxGroup - minGroup + 1) + minGroup);
            System.out.println("Group size " + this.group);
            if (TABLE < numberTable) {
                System.out.println("No free tables, come another day!");
                break;
            }

            if (this.group <= 4) {
                System.out.println("You are at a table for four, number table " + numberTable);
                this.customers -= 4;
            } else if (this.group <= 6) {
                System.out.println("You are at a table for six, number table " + numberTable);
                this.customers -= 6;

            } else if (this.group <= 8) {
                System.out.println("You are at a table for eight, number table " + numberTable);
                this.customers -= 8;
            }
            if (customers > 0) {
                System.out.printf("\nRemaining free seats %s \n", this.customers);
                numberTable++;

            }

        }
        if (this.customers >= availableSeats) {
            System.out.println("No free tables, come another day!  ");
        }
        return numberTable;
    }

    public void takeOrderFromTable(Menu menu, Waiter waiter) {
        if (this.waiter == null) {
            throw new IllegalStateException("The table must have an assigned waiter before it can take orders.");
        }
        Order order = new Order(this, waiter);
        order.takeOrder(menu);
        order.calculateTip();
        this.addOrder(order);
        System.out.printf("Waiter %s received a %.2f $ tip.\n", waiter.getName(), order.getTip());
    }

    public void printBill() {
        for (Order order : orders
        ) {
            System.out.printf("Order ID: %d, Price: %.2f $, Tip:%.2f $\n", order.getNextId(), order.getPrice(), order.getTip());

        }

    }
}
