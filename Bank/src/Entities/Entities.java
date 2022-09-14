package Entities;

public class Entities {

    public String accountData;

    private int number;
    private String accountHolder;
    public double initial;
    private double depositValue;

    private double initialDeposit;

    public void getInitial(double initial) {
        this.initial = initial;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public int getNumber() {
        return number;
    }
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }
    public double getDepositValue() {
        return depositValue;
    }

    public void setDepositValue(double depositValue) {
        this.depositValue = depositValue;
    }

    public double getInitialDeposit() {
        return initialDeposit;
    }

    public Entities( String accountHolder, int number) {
        this.accountHolder = accountHolder;
        this.number = number;
    }
    public void addEntites(double initial){
        this.initial += initial;
    }

    public void removeEntites(double initial){
        this.initial -= initial + 5;
    }

    public String toString(){
        return  "Account: " + number + ", Holder: " + accountHolder + ", Balance: $" +  initial ;

    }
}
