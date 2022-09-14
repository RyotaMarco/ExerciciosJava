import java.util.Scanner;

public class decima_nona {
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a senha:");
        x = sc.nextInt();
        while ( x !=2002){
            System.out.println("Senha invalida!");
            x = sc.nextInt();
        }
        System.out.println("Senha valida!");
    }
}
