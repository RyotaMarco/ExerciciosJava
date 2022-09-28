package Application;

import Entities.Account;
import Entities.BusinessAccount;
import Entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {

        Account acc = new Account(1001,"Alex",0.0);
        BusinessAccount bacc = new BusinessAccount(1002,"Maria",0.0,500.0);

        //UPCASTING

        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003,"Bob", 0.0,200.0);
        Account acc3 = new SavingsAccount(1004,"Ana",0.0,0.01);

        //DOWNCASTING

        BusinessAccount bacc1 = (BusinessAccount) acc2;
        bacc1.loan(100.0);

        //BusinessAccount bacc2 = (BusinessAccount) acc3;
        if (acc3 instanceof BusinessAccount){
            BusinessAccount bacc2 = (BusinessAccount) acc3;
            bacc2.loan(200.0);
            System.out.println("Loan!");
        }
        if(acc3 instanceof SavingsAccount){
            SavingsAccount bacc2 = (SavingsAccount) acc3;
            bacc2.updateBalance();
            System.out.println("Update!");
        }

        Account acc4 = new Account(1005,"Marco",1000.00);
        acc4.withdraw(200.0);
        System.out.println(acc4.getBalance());

        Account acc5 = new SavingsAccount(1006,"Joana", 1000.0,0.01);
        acc5.withdraw(200.0);
        System.out.println(acc5.getBalance());

        Account acc6 = new BusinessAccount(1007,"Pedro",1000.0,500.0);
        acc6.withdraw(200.0);
        System.out.println(acc6.getBalance());

    }
}
