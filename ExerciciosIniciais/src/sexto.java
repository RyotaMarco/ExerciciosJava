import java.util.Scanner;

public class sexto {
    public static void main(String[] args) {
    double a, b, c,tri,cir,tra,qua,ret;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o valor de A:");
        a = sc.nextDouble();
        System.out.println("Informe o valor de b:");
        b = sc.nextDouble();
        System.out.println("Informe o valor de c:");
        c = sc.nextDouble();
        tri = (a*c)/2;
        System.out.printf("Triangulo: %.3f%n", tri);
        cir = (c * c) * 3.14159;
        System.out.printf("Circulo: %.3f%n", cir);
        tra = ((a + b) * c) /2;
        System.out.printf("Trapezio: %.3f%n", tra);
        qua = b * b;
        System.out.printf("Quadrado: %.3f%n", qua);
        ret = a * b;
        System.out.printf("Retangulo: %.3f%n", ret);
    }
}
