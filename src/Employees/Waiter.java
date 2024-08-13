package Employees;

public class Waiter extends Employee {
    private double tip;
    private double totalTip = 0;
    private double totalOrder = 0;
    public Waiter(String name, String position, double salary) {
        super(name, position, salary);
    }

    public double getTip() {
        return tip;
    }

    public void setTip(double tip) {
        this.tip = tip;
    }

    public double getTotalTip() {
        return totalTip;
    }

    public void setTotalTip(double totalTip) {
        this.totalTip = totalTip;
    }

    public void addTotalOrder(double amount) {
        this.totalOrder += amount;
    }

    public void addTips(double tip) {
        this.totalTip += tip;
    }
}


