package model.entities;

import model.exceptions.DomainException;

public class Account {

    public Double amount;
    private Integer number;

    private String holder;

    private Double balance;

    private Double withdrawLimit;

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }


    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public void Withdraw(double amount) throws DomainException{
        if (amount>withdrawLimit){
            throw new DomainException("Witrhdraw error: The amount exceeds withdraw limit.");
        } else if(balance< amount){
            throw new DomainException("Withdraw error: not enough balance.");

        }
        else{
            this.amount = balance - amount;
        }

        }


    public void Deposit(Double amount) {
        this.amount = balance + amount;
    }

    public String toString(){
        return  "Account: " + number + ", Holder: " + holder + ", Balance: $" +  balance ;

    }
}
