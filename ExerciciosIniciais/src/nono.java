import java.util.Scanner;

public class nono {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe os valores:");
        a = sc.nextInt();
        b = sc.nextInt();
        if (a%b==0 || b%a==0){
            System.out.println("Sao multiplos");
        }
        else{
            System.out.println("Nao sao multiplos");
        }
    }
}
