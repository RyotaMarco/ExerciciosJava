package Main;

import Entities.Entities;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers will be? ");
        int n = sc.nextInt();
        Entities vect[] = new Entities[n];

        double number = 0;
        for (int i = 0; i < vect.length; i++) {
            System.out.print("Text a number: ");
            number = sc.nextDouble();
            vect[i] = new Entities(number);
        }
        double biggerNumber = 0;
           double bigger = vect[0].getNumber();
       double plus = 0;
        for (int i = 1; i < vect.length; i++) {
            if (vect[i].getNumber() > bigger){
                bigger = vect[i].getNumber();
                biggerNumber = i;

        }

        }
        System.out.printf("MAIOR VALOR = %.1f\n", bigger);
        System.out.printf("POSICAO DO MAIOR VALOR = %1f\n", biggerNumber);
    }
}
