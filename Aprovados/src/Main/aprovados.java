package Main;

import Entities.Entities;


import java.util.Locale;
import java.util.Scanner;

public class aprovados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Quantos alunos serao digitados? ");
        int n = sc.nextInt();
        Entities vect[] = new Entities[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Digite nome, primeira e segunda nota do  %do  aluno:\n", i + 1);
            sc.nextLine();
            String name = sc.nextLine();
            double nota1 = sc.nextDouble();
            double nota2 = sc.nextDouble();
            double media = 0;
            vect[i] = new Entities(name, nota1, nota2, media);
        }
        double soma = 0;
        System.out.println("Alunos aprovados: ");
        for (int i = 0; i < n; i++) {
            soma += vect[i].getNota1() + vect[i].getNota2();

            double avg = soma / 2;
            if (avg >= 6) {
                System.out.println(vect[i].getName());
            }
        }
    }
}

