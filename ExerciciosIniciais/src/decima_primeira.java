import java.util.Scanner;

public class decima_primeira {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double codigo, quantidade, total;

        System.out.println("Informe o codigo do produto:");
        codigo = sc.nextDouble();
        System.out.println("Informe a quantidade:");
        quantidade = sc.nextDouble();
        if(codigo==1) {
          total = 4 * quantidade;
            System.out.println("Total: " + total);
        }
        else {
        if (codigo==2) {
        total = 4.5 * quantidade;
        System.out.println("Total: " + total);
                }
        else{
            if (codigo==3){
                total = 5 * quantidade;
                System.out.println("Total: " + total);
        }
            else {
                    if (codigo==4){
                        total = 2 * quantidade;
                        System.out.println("Total: " + total);

                    }
                    else {
                        total = 1.5 * quantidade;
                        System.out.println("Total: " + total);
                        }
                    }
                }
            }
        }
    }

