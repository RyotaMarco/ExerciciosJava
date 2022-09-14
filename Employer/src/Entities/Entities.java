package Entities;

public class Entities {
    public String name;

    public double grossSalary;

    public double tax;

    public double percent;

    public double netSalary(){
        return grossSalary - tax;
    }
    public void increaseSalary(double percent){
        grossSalary += grossSalary * percent / 100;
    }


    public String toString() {
        return "Employee: " + name + netSalary();
    }
}
