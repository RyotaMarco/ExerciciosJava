package Application;

import Entities.CompanyTax;
import Entities.GeneralTax;
import Entities.IndividualTax;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<GeneralTax> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or company(i/c)? ");
            char ch = sc.next().charAt(0);
            if (ch == 'i') {
                System.out.print("Name: ");
                String name = sc.next();
                System.out.print("Anual income: ");
                double income = sc.nextDouble();
                System.out.print("Health expenditures:");
                double health = sc.nextDouble();
                GeneralTax tax = new IndividualTax(name, income, health);
                list.add(tax);
            } else {
                System.out.print("Name: ");
                String name = sc.next();
                System.out.print("Anual income: ");
                double income = sc.nextDouble();
                System.out.print("Number of employees:");
                int employees = sc.nextInt();
                GeneralTax tax = new CompanyTax(name, income, employees);
                list.add(tax);
                if (employees >= 10) {
                    double value = income * 0.14;
                } else {
                    double value = income * 0.16;
                }
            }
        }

        double sum = 0;
        for (GeneralTax tax : list) {
            System.out.print(tax.getName() + ": $" + String.format("%.2f", tax.paid()) + "\n");
            sum = sum + tax.paid();

        }
        System.out.print("");
        System.out.print("Total taxes: $" + sum);
    }
}
