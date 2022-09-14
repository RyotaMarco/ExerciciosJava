package Main;


import java.util.Locale;
import java.util.Scanner;
import Entities.Entities;

public class Aplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);


        System.out.println("Enter product data: ");
        System.out.println("Name: ");
        String name = sc.nextLine();
        System.out.println("Price: ");
        double price = sc.nextDouble();

        Entities Entities = new Entities(name, price);

        Entities.setName("Computer");
        Entities.setPrice(1200);
        System.out.println("Updated price: " + Entities.getPrice());
        System.out.println("Updated name: " + Entities.getName());
        System.out.println("Product data: " + Entities);

        System.out.println("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        Entities.addProduct(quantity);
        System.out.println("Updated data: " + Entities);
        System.out.println("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        Entities.removeProducts(quantity);
        System.out.println("Updated data: " + Entities);
        sc.close();
    }

}
