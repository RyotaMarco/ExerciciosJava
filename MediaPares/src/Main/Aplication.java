package Main;
import java.util.Locale;
import java.util.Scanner;

public class Aplication {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i<n;i++){
            System.out.println("Digite um numero: ");
            a[i]= sc.nextInt();
        }
        double soma = 0;
        double x = 0;
        for (int i = 0; i<n;i++){
            double valores = a[i];
            if (valores%2==0) {
                soma += a[i];
               x++;
            }
        }
        if (x==0){
                System.out.println("Nenhum numero par");
        if (soma%2==0){
        double avg = soma/x;
        System.out.printf("Media dos pares: %.0f%n " , avg);
        }
    }


    }
}
