import java.util.Scanner;

public class segundo {
    public static void main(String[] args) {
        System.out.println("Diga o valor do raio:");
        Scanner sc = new Scanner(System.in);
        double x,y;
        x = sc.nextDouble();
        double v = x * x;
        y = 3.14159 * (v);
        System.out.printf("O valor da area e: %.4f%n",y );
    }
}
