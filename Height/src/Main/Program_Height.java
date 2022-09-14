package Main;

import Entities.Entities;


import java.util.Locale;
import java.util.Scanner;

public class Program_Height {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.println("Who many people will be? ");
        int n = sc.nextInt();
        Entities vect[] = new Entities[n];


        double age = 0;
        for (int i = 0; i < vect.length; i++) {
            System.out.printf("Data from %da person:\n", i + 1);
            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Age: ");
            age = sc.nextDouble();
            System.out.print("Height: ");
            double height = sc.nextDouble();
            vect[i] = new Entities(name, age, height);
        }

        double soma = 0;
        for (int i = 0; i < vect.length; i++) {
            soma += vect[i].getHeight();
        }
        double avg = soma / vect.length;

        double agePlus = 0;
        double resume = 0;
        double g = 0;
        double media = 0;
        for (int i = 0; i < vect.length; i++) {
            agePlus = vect[i].getAge();
            if (agePlus < 16) {
                g++;
            }
            resume = g / vect.length;
            media = 100 * resume;

        }

        System.out.printf("Average height: %.2f%n", avg);
        System.out.println("People under sixteen : " + media + "%");

        for (int i = 0; i < vect.length; i++) {
            if (agePlus < 16) {
                System.out.println(vect[i].getName());
            }

        }
        sc.close();
    }
}


