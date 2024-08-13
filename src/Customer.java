
import Employees.Employee;
import Employees.EmployeеList;
import Employees.Waiter;
import Restaurant.FoodAndDrink.Menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Customer {
    private int id = 1;
    private String NAME;
    private Table table;

    public Customer(String name, boolean tip) {
        NAME = name;

    }

    public Customer() {
    }

    public String getNAME() {
        return NAME;
    }

    public void assignTable(Table table) {
        this.table = table;
    }

    public void assignWaitersToCustomers() {

        int tableCount = table.getNumberTable();
        EmployeеList employeеList = new EmployeеList();
        List<Waiter> waiters = new ArrayList<>();
        for (Employee employee : employeеList.getEmployee()) {
            if (employee instanceof Waiter) {
                waiters.add((Waiter) employee);
            }
        }

        for (int i = 1; i < tableCount; i++) {
            Employee waiter = waiters.get(i % waiters.size());
            System.out.printf("Hello, you are served by a %s, with an order number %d for the day.\n", waiter.getName(), id++);

        }


    }


}
