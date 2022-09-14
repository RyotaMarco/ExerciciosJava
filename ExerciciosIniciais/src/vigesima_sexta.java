import java.util.Scanner;

public class vigesima_sexta {
    public static void main(String[] args) {
        int p, pm;
        double d1, d2, d3, t;
            t= 0;
            Scanner sc = new Scanner(System.in);
            System.out.println("Informe o numero de pares: ");
            pm = sc.nextInt();
        for (p = 1; p <= pm; p++) {

            d1 = sc.nextDouble();
            d2 = sc.nextDouble();
        if (d2==0){
            System.out.println("divisao impossivel!");

            }
        else{
            t = d1 / d2;
            System.out.println(t);
            }

        }

    }
}
