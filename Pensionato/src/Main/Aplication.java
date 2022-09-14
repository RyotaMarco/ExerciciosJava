package Main;

import Entities.Entities;
import java.util.Locale;
import java.util.Scanner;

public class Aplication {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos quartos serao alugados? ");
        int n = sc.nextInt();
        int room = 0;
        Entities[] vect = new Entities[10];


        for (int i = 0; i < n; i++) {
            System.out.printf("Aluguel %d#:\n", i + 1);
            sc.nextLine();
            System.out.print("Nome:");
            String name = sc.nextLine();
            System.out.print("Email:");
            String email = sc.nextLine();
            System.out.print("Quarto:");
            room = sc.nextInt();

            vect[room] = new Entities(name, email);

        }
        String nomesOcupados;
        String emailOcupados;
        System.out.println("Quartos ocupados: ");
        for (int i = 1; i < 10; i++) {
            if (vect[i] != null) {
                nomesOcupados = vect[i].getName();
                emailOcupados = vect[i].getEmail();
                System.out.println(i+ ": " + nomesOcupados + ", " + emailOcupados);

            }


        }
        sc.close();
    }
}