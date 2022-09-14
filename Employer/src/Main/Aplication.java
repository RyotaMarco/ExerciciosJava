package Main;
import Entities.Entities;
import java.util.Locale;
import java.util.Scanner;

public class Aplication {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Entities Entities = new Entities();
        System.out.println("Enter employer data: ");
        System.out.println("Name: ");
        Entities.name = sc.nextLine();
        System.out.println("Gross salary: ");
        Entities.grossSalary= sc.nextDouble();
        System.out.println("Tax: ");
        Entities.tax = sc.nextDouble();

        System.out.println(Entities);

        System.out.println("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        Entities.increaseSalary(percentage);

        System.out.println(Entities);
    }
}
