package Aplication;

import Entities.Client;
import Entities.Order;
import Entities.OrderItem;
import Entities.Product;
import EntitiesEnum.OrderStatus;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Program {
    public static void main(String[] args) throws ParseException {
    Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Date atual = new Date();

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email:");
        String email = sc.nextLine();
        System.out.print("Birth date(DD/MM/YYYY):");
        Date brithDate = sdf.parse(sc.next());
        Client client = new Client(name,email,brithDate);

        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        String orderStatus = sc.next();

        System.out.print("How many items to this order? ");
        int n = sc.nextInt();
        Order order = new Order(atual, OrderStatus.valueOf(orderStatus));

        for (int i=1;i<=n;i++){
        System.out.println("Enter "+ i + "#" + " item data: ");
        sc.nextLine();
        System.out.print("Product name: ");
        String productName = sc.nextLine();
        System.out.print("Product price: ");
        double price = sc.nextDouble();
        System.out.print("Quantity: ");
        Integer quantity = sc.nextInt();
            Product product = new Product(productName,price);
            OrderItem orderItem = new OrderItem(product,quantity,price);
            order.addItens(orderItem);
        }
        System.out.println("Order Summary: ");
        sc.nextLine();
        System.out.println("Order moment: " + atual);
        System.out.println("Order Status: " + orderStatus);
        System.out.println(client);
        System.out.println("Order items: ");
        System.out.println(order.getItens());
        System.out.println(order);

        sc.close();
    }
}
