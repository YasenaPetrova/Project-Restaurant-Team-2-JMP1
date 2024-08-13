package Employees;

import java.util.ArrayList;
import java.util.List;

public class EmployeеList {
    private List<Employee> employee;

    public EmployeеList() {
        employee = new ArrayList<>();
        listCharacteristicsEmployee();
    }

    public List<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(List<Employee> employee) {
        this.employee = employee;
    }

    private void listCharacteristicsEmployee() {
        employee.add(new Waiter("Emily Carter", "Waiter", 1100));
        employee.add(new Waiter("Michael Smith", "Waiter", 1400));
        employee.add(new Waiter("Dimitur Georgiev", "Waiter", 1400));
        employee.add(new Bartender("James Williams", "Bartender", 1600));
        employee.add(new Bartender("Victoria Simeonova", "Bartender", 1600));
        employee.add(new Cook("Olivia Brown", "Cook", 1800));
        employee.add(new Cook("Ethan Davis", "Cook", 1800));
        employee.add(new Cleaner("Charlotte Wilson", "Cleaner", 1000));
        employee.add(new Cleaner("Isabella Thompson", "Cleaner", 1000));

    }


}
