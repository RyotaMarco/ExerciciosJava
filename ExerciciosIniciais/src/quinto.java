import java.util.Scanner;

public class quinto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x,y,z,h,i,j,k;

        System.out.println("Informe o codigo da peca 1: ");
        x = sc.nextDouble();
        System.out.println("Informe o codigo da peca 2: ");
        y = sc.nextDouble();
        System.out.println("Informe o numero de pecas 1:");
        z = sc.nextDouble();
        System.out.println("Informe o numero de pecas 2:");
        h = sc.nextDouble();
        System.out.println("Informe o valor das pecas 1:");
        i = sc.nextDouble();
        System.out.println("Informe o valor das pecas 2:");
        j = sc.nextDouble();

        k = (i * z) + (j * h);
        System.out.printf("O valor a pagar e: R$%.2f%n", k);
    }
}
