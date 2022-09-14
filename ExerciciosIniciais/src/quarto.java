import java.util.Scanner;

public class quarto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double y,z;
        int x;
        System.out.println("Digite o seu numero:");
         x = sc.nextInt();
        System.out.println("Digite as suas horas trabalhadas:");
        y = sc.nextDouble();
        System.out.println("Digite quanto recebe por horas:");
        z = sc.nextDouble();
        double h = y * z;
        System.out.println("O seu numero e: \n" + x);  ;

        System.out.printf("O seu salario e: R$%.2f%n", h);

    }
}
