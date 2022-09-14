import java.util.Scanner;

public class vigesima_setima {
    public static void main(String[] args) {
    int n,total,f;
        total = 1;

    Scanner sc = new Scanner(System.in);
    System.out.println("Informe o valor: ");
    f = sc.nextInt();
    if(f==0){
            System.out.println("1");
    }
    else{
            for (n=1;n<=f;n++){
            total = total * n ;


            }
        }    System.out.println(total);
    }
}
