import java.util.Scanner;

public class vigesima_oitava {
    public static void main(String[] args) {
        int n,t,res;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(t=1;t<=n;t++) {
            if(n % t == 0) {
                System.out.println(t);
            }

        }

    }

}
