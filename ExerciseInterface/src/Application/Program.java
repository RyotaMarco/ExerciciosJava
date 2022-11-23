package Application;

import Entities.Contract;
import Entities.Installment;
import Service.ContractService;
import Service.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Locale.setDefault(Locale.US);


        System.out.println("Enter with contract data: ");
        System.out.print("Contract number: ");
        int number = sc.nextInt();
        System.out.print("Date(dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.next(), dtf);
        System.out.print("Total value: ");
        double totalValue = sc.nextDouble();
        Contract contract = new Contract(number, date, totalValue);
        System.out.print("Enter installments number: ");
        int installments = sc.nextInt();
        ContractService contractService = new ContractService(contract, installments, new PaypalService());
        contractService.processContract(contract, installments);
        System.out.println("Installments value: ");
        for (Installment installment : contract.getInstallments()) {
            System.out.println(installment);
        }

        sc.close();
    }
}


