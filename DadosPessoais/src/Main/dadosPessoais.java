package Main;

import Entities.Entities;

import java.util.Locale;
import java.util.Scanner;

public class dadosPessoais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();

        Entities vect[] = new Entities[n];

        for (int i = 0; i<n; i++){
            System.out.printf("Altura da %da  pessoa:\n", i + 1);
            double altura = sc.nextDouble();
            System.out.printf("Genero da %da  pessoa:\n", i + 1);
            sc.nextLine();
            char genero = sc.next().charAt(0);;
            vect[i] = new Entities(altura,genero);
        }


        double menor = vect[0].getAltura();
        double maior = vect[0].getAltura();

        for (int i = 0; i<n; i++){
            if (vect[i].getAltura() < menor){
                menor = vect[i].getAltura();
            }
        }
        for (int i = 0; i<n; i++){
            double mais = vect[i].getAltura();
            if (vect[i].getAltura() > maior){
                maior = vect[i].getAltura();
            }
        }

        double soma =0;
        int g =0;
        int m =0;
            for (int i = 0; i<n; i++) {
                if (vect[i].getGenero() == 'F') {
                    soma += vect[i].getAltura();
                    g++;
                }else{
                   m++;
                }
        }
            double avg = soma/g;

        System.out.printf("Menor altura: %.2f%n " ,menor);
        System.out.printf("Maior altura: %.2f%n " ,maior);
        System.out.printf("Media das alturas das mulheres: %.2f%n " ,avg);
        System.out.print("Numero de homens: " +m);




    }
}
