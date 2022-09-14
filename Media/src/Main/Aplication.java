package Main;

import java.util.Locale;
import java.util.Scanner;

public class Aplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.println("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

       double[] a = new double[n];

        double soma = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Digite um numero: ");
            a[i] = sc.nextDouble();

        }
        for (int i = 0; i < n; i++) {
            soma += a[i];
        }
        double avg = soma / n;
        System.out.printf("Media do vetor = %.3f%n ", avg);
        System.out.println("Elementos a baixo da media: ");
        for (int i = 0; i < n; i++) {
            if (a[i]< avg) {
                System.out.println(a[i]);
            }
        }
    }
}
