package Main;

import Entities.Entities;
import java.util.Locale;
import java.util.Scanner;

public class Aplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
System.out.println("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        Entities[] vect = new Entities[n];
        double soma = 0;

        int negativos = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Digite um numero: ");
            negativos = sc.nextInt();
            vect[i] = new Entities(negativos);
        }
        System.out.println("Numeros negativos: ");
        for(int i = 0; i<vect.length; i++){
            if (vect[i].getNegativos() < 0) {
                System.out.println(vect[i].getNegativos());
            }
        }


    }
}
