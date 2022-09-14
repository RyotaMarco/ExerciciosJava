import java.util.Scanner;

public class vigesima_nona {
    public static void main(String[] args) {
        int l,n,cubo,quadrado;
        cubo = 0;
        quadrado =0;
        Scanner sc = new Scanner(System.in);
        l = sc.nextInt();
        for(n=1;n<=l;n++){

            cubo = n*n;
            quadrado = n*n*n;
            System.out.println(n + " " + cubo + " " + quadrado);

        }

    }
}
