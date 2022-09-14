package Main;





import Entities.Entities;
import java.util.Locale;
import java.util.Scanner;

public class Aplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n = sc.nextInt();
        Entities[] vect = new Entities[n];


        for(int i = 0; i< vect.length; i++){
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new Entities(name, price);
        }

        double soma = 0;
        for(int i = 0; i<vect.length; i++){
            soma += vect[i].getPrice();
        }
        double avg = soma/vect.length;
        System.out.println("AVG: "+ avg);

        sc.close();
    }
}
