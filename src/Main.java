import Employees.Employee;
import Employees.EmployeеList;
import Employees.Waiter;
import Restaurant.FoodAndDrink.Menu;
import Restaurant.FoodAndDrink.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        System.out.println("JavaBite Bistro");
        System.out.println("");

        Restaurant obj = new Restaurant("JavaBite", 4, 21000);
        Menu menu = new Menu();
        Revenue revenue = new Revenue();
        EmployeеList employeеList = new EmployeеList();

        List<Table> tables = new ArrayList<>();

        Table seatsTable = new Table(null);
        int numberTable = seatsTable.Seats();
        seatsTable.Seats();

        menu.printMenu();

        List<Waiter> waiters = new ArrayList<>();
        for (Employee employee : employeеList.getEmployee()) {
            if (employee instanceof Waiter) {
                waiters.add((Waiter) employee);
            }
        }

        if (!waiters.isEmpty()) {
            for (int i = 1; i <= numberTable; i++) {
                if (i < 12) {
                    Waiter assignedWaiter = waiters.get((i) % waiters.size());
                    Table newTable = new Table(assignedWaiter);
                    tables.add(newTable);
                }
            }
        } else {
            System.out.println("There are no waiters available to assign to tables.");
        }

        for (Table table : tables) {
            System.out.println("");
            System.out.printf("Table %d, Waiter: %s. \n", table.getId(), table.getWaiter().getName());
            table.takeOrderFromTable(menu, table.getWaiter());
            table.printBill();
            revenue.addRevenue(table.gettotalBill());
        }

        for (Waiter waiter : waiters) {
            System.out.printf("\nWaiter %s collected tips: %.2f $.\n", waiter.getName(), waiter.getTotalTip());
        }
        System.out.printf("\nTotal Revenue: %.2f $.\n", revenue.gerNetRevenue());
        scanner.close();
    }
}