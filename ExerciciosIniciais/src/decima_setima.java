import java.util.Scanner;

public class decima_setima {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double largura, comprimento,metroQuadrado,area,preco;
        largura = sc.nextDouble();
        comprimento = sc.nextDouble();
        metroQuadrado = sc.nextDouble();
        area = largura * comprimento;
        preco = area * metroQuadrado;
        System.out.printf("Area = %.2f%n",area);
        System.out.printf("Preco = %.2f%n", preco);
    }
}
