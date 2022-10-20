package Aplication;

import model.entities.Account;
import model.exceptions.DomainException;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

            try {
                System.out.println("Enter Account data: ");
                System.out.print("Number: ");
                int number = sc.nextInt();
                System.out.print("Holder: ");
                String holder = sc.next();
                sc.nextLine();
                System.out.print("Initial balance: ");
                double balance = sc.nextDouble();
                System.out.print("Withdraw limit: ");
                double withdrawLimit = sc.nextDouble();
                Account account = new Account(number, holder, balance, withdrawLimit);

                System.out.println("Account resume: " + account);

                System.out.print("Enter amount for withdraw: ");
                double amount = sc.nextDouble();
                account.Withdraw(amount);

                System.out.print("New Balance: $" + account.getAmount());
            }
            catch (DomainException e ){
                System.out.print(e.getMessage());
            }

    }
}
