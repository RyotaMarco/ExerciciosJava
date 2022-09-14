import java.util.Scanner;

public class terceiro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c,d,e;
        System.out.println("Digite os valores:");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        e = (a * b) - (c * d);
        System.out.println("O valor da diferenca dos produtos e:");
        System.out.println(e);
    }
}
