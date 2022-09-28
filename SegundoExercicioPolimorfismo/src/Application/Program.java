package Application;

import Entities.ImportedProduct;
import Entities.Product;
import Entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        List<Product> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            System.out.println("Product #" + i + " data:");
            System.out.print("Common, used or imported(c/u/i)?");
            char ch = sc.next().charAt(0);
            if (ch == 'i') {
                System.out.print("Name:");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.print("Price:");
                double price = sc.nextDouble();
                System.out.print("Customs fee: ");
                double customsFee = sc.nextDouble();
                Product product = new ImportedProduct(name, price, customsFee);
                list.add(product);
            }
            if (ch == 'c') {
                System.out.print("Name:");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.print("Price:");
                double price = sc.nextDouble();
                Product product = new Product(name, price);
                list.add(product);
            }
            if (ch == 'u') {
                System.out.print("Name:");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.print("Price:");
                double price = sc.nextDouble();
                System.out.print("Manufacture date(DD/MM/YYYY): ");
                Date manufactureDate = sdf.parse(sc.next());
                Product product = new UsedProduct(name, price, manufactureDate);
                list.add(product);
            }
        }
        System.out.println();
        System.out.println("PAYMENTS:");
        for (Product product : list) {
            System.out.print(product.priceTag() + "\n");
        }
    }
}
