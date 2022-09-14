import java.util.Scanner;

public class vigesima_segunda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,i,soma,x;
        soma = 0;
        n = sc.nextInt();
        for (i = 0;i<n;i++){
            x = sc.nextInt();
            soma += x;

        }
        System.out.println(soma);
    }
}
