package Main;

import Entities.Entities;
import java.util.Locale;
import java.util.Scanner;

public class Aplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("How many numbers will be? ");
        int n = sc.nextInt();
        Entities vect[] = new Entities[n];

        int number = 0;
        for (int i = 0; i < vect.length; i++) {
            System.out.println("Text a number: ");
            number = sc.nextInt();
            vect[i] = new Entities(number);

        }

            System.out.println("Pair numbers: ");

            int numberPair = 0;
            for (int i = 0; i < vect.length; i++) {
                numberPair = vect[i].getNumber();
                if (numberPair % 2 == 0) {

                    System.out.println(vect[i].getNumber());

                }
        }
    }
}
