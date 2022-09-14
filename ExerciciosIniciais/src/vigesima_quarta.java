import java.util.Scanner;

public class vigesima_quarta {
    public static void main(String[] args) {
        int n,x,z,in,out;
        in=0;
        out=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a quantidade de numeros: ");
        n = sc.nextInt();
        for (x=0;x<n;x++){

            z = sc.nextInt();
            if(z>=10 && z<=20){
                in = in + 1;
            } else{
                out = out + 1;
            }
        }
        System.out.println(in + " in " + out + " out");
    }
}
