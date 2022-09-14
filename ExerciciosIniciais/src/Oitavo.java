import java.util.Scanner;

public class Oitavo {
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o valor a ser verificado:");
        x = sc.nextInt();
        if ( x%2==0){
            System.out.println("O valor e par");
        }
        else{
            System.out.println("O valor e impar");
        }
    }
}
