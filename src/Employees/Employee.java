package Employees;

import java.beans.Customizer;
import java.util.List;

public class Employee  {
    private String name;
    private String position;
    private double salary;




    public Employee(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;

    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getTotalSalary(){
        return getSalary();

    }


    public String toString() {
        return "Name: " + this.name + " Position: " + this.position + " Salary: " + String.format("%.2f", this.salary) + " $ ";
    }


}
