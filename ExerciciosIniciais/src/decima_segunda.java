import java.util.Scanner;

public class decima_segunda {
    public static void main(String[] args) {
        double x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o valor:");
        x = sc.nextDouble();
        if (x >= 0 && x <= 25){
        System.out.println("O valor esta entre os intervalos de 0 a 25");
        }
        else {
            if (x>= 25 && x<= 50) {
                System.out.println("O valor esta entre os intervalos de 25 a 50");
            }
                else{
                    if (x>=50 && x<=75) {
                        System.out.println("O valor esta entre os intervalos de 50 a 75");
                    }
                    else {
                        if (x >= 75 && x <= 100) {
                            System.out.println("O valor esta entre os intervalos de 75 a 100");
                        }
                        else{
                            if (x< 0 || x >100){
                                System.out.println("Fora de intervalo");
                                }
                            }
                        }
                    }
                }
            }
        }


