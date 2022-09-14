package Main;
import Entities.Entities;
import java.util.Locale;
import java.util.Scanner;

public class Aplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Quantas pessoas voce vai digitar? ");
        int n = sc.nextInt();
        Entities vect[] = new Entities[n];
        for (int i = 0; i < vect.length; i++) {
            System.out.printf("Dados da %da pessoa:\n", i + 1);
            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Idade: ");
            double idade = sc.nextDouble();
            vect[i] = new Entities(name, idade);
        }
        double velho = vect[0].getIdade();
        String idoso = sc.nextLine();
        for (int i = 1; i < vect.length; i++) {
            if (vect[i].getIdade() > velho) {
                idoso = vect[i].getName();
            }

        }
        System.out.println("Pessoa mais velha: " + idoso);


    }
}
