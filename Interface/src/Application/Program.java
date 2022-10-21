package Application;

import modelEntities.CarRental;
import modelEntities.Vehicle;
import modelServices.BrazilTaxService;
import modelServices.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the rental date:");
        System.out.print("Car model: ");
        String carModel = sc.nextLine();
        System.out.print("retreat(dd/MM/yyyy): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
        System.out.print("Devolution(dd/MM/yyyy): ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);

        CarRental carRental = new CarRental(start,finish,new Vehicle(carModel));

        System.out.print("Enter with hour price: ");
        double pricePerHour = sc.nextDouble();
        System.out.print("Enter with day price: ");
        double pricePerDay = sc.nextDouble();

        RentalService rentalService = new RentalService(pricePerDay,pricePerHour,new BrazilTaxService());

        rentalService.processInvoice(carRental);

        System.out.println("INVOICE: ");
        System.out.print("Basic payment: " + String.format("%.2f", carRental.getInvoice().getBasicPayment()));
        System.out.print("Tax: " + String.format("%.2f",carRental.getInvoice().getTax()));
        System.out.print("Full payment: " + String.format("%.2f",carRental.getInvoice().getotalPayment()));

        sc.close();
    }
}
