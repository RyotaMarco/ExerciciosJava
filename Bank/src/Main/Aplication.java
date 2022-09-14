package Main;

import Entities.Entities;
import java.util.Locale;
import java.util.Scanner;

public class Aplication {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account holder: ");
        String accountHolder = sc.nextLine();

        System.out.println("Enter account number: ");
        int number = sc.nextInt();

        Entities entities= new Entities(accountHolder, number);

        System.out.println("Is there a initial deposit(y/n)? ");
        char setInitial = sc.next().charAt(0);



        if (setInitial == 'y') {
            System.out.println("Enter initial deposit value: ");
            entities.initial = sc.nextDouble();
        } else if(setInitial == 'n'){
            entities.initial = 0;
        }

        System.out.println("Account data: ");
        System.out.println(entities);

        System.out.println("Enter a deposit value: ");
        double initial = sc.nextDouble();
        entities.addEntites(initial);
        System.out.println("Update account data: ");
        System.out.println(entities);

        System.out.println("Enter a withdraw value: ");
        initial = sc.nextDouble();
        entities.removeEntites(initial);
        System.out.println("Update account data: ");
        System.out.println(entities);
    }
}

