package Main;

import Entities.Entities;

import java.util.Locale;
import java.util.Scanner;

public class Aplication {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Entities entities = new Entities();

        System.out.println("What is the dollar price? ");
        entities.price = sc.nextDouble();
        System.out.println("How many dollar will be bought? ");
        entities.dolar = sc.nextDouble();
        System.out.println(entities);
    }
}
