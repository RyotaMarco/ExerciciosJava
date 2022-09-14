import java.util.Scanner;

public class decima_terceira {
    public static void main(String[] args) {
        double x ,y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o s valores de x: ");
        x = sc.nextDouble();
        System.out.println("Informe o s valores de y: ");
        y = sc.nextDouble();
        if (x>0 && y>0){
            System.out.println("Q1");
        }
        else{
            if (x<0 && y>0){
                System.out.println("Q2");
            }

        else{
            if (x>=0 && y<0){
                System.out.println("Q4");
            }
            else{
                if (x<0 && y<0){
                    System.out.println("Q3");
                    }
                else{
                    if (x==0 && y==0){
                        System.out.println("Origem");
                    }

                 }
                }
            }
        }
    }
}