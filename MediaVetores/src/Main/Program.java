package Main;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n = sc.nextInt();
        double[] vect = new double[n];
        for (int i=0;i<n;i++){
            vect[i] = sc.nextDouble();
        }
        double soma = 0;
        for (int i = 0; i<n; i++) {
            soma += vect[i];
        }
        double avg = soma/ n;
        System.out.println(avg);




        sc.close();
    }
}
