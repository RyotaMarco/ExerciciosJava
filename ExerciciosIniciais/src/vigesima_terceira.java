import java.util.Scanner;

public class vigesima_terceira {
    public static void main(String[] args) {
        int x,soma,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um numero: ");
        x = sc.nextInt();
        for (n=0;x>n;n++){
            if (n%2!=0){
                System.out.println(n);
            }
        }
    }
}
