package Entities;

public class CompanyTax extends GeneralTax {
    private int Employees;

    public CompanyTax(){

    }

    public int getEmployees() {
        return Employees;
    }

    public void setEmployees(int employees) {
        Employees = employees;
    }

    public CompanyTax(String name, Double anualIncome, int employees) {
        super(name, anualIncome);
        Employees = employees;
    }
    @Override
    public double paid() {
        if (getEmployees()>10){
            return getAnualIncome() * 0.14;
        }else{
            return getAnualIncome() * 0.16;
        }
    }
}
