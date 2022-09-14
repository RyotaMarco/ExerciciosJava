import java.util.Scanner;

public class decima_quinta {
    public static void main(String[] args) {
        int minutos;
        double total;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe os minutos: ");
        minutos = sc.nextInt();
        if (minutos > 100) {
            total = ((minutos - 100) * 2)+ 50;
            System.out.printf("Valor a pagar e: R$ %.2f%n",total);
        } else {
            System.out.println("O valor a pagar e: R$50.00");
        }
    }
}