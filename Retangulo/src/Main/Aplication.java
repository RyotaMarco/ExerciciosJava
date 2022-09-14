package Main;
import Entities.Entities;
import java.util.Locale;
import java.util.Scanner;

public class Aplication {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Entities Entities = new Entities();
        System.out.println("Infos from rectangle: ");
        System.out.println("Width: ");
        Entities.width = sc.nextDouble();
        System.out.println("Height: ");
        Entities.height = sc.nextDouble();

        System.out.println("Product data : " + Entities);
    }
}
