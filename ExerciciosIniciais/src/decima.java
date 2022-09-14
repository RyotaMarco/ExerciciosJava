import java.util.Scanner;

public class decima {
    public static void main(String[] args) {
        int x,y, t;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a hora de inicio e fim do jogo:");
        x = sc.nextInt();
        y = sc.nextInt();
        if (x < y) {
            t = y - x;
            System.out.println("O jogo durou " + t + "horas");
        }
        else{
            t = 24 - x +y;
            System.out.println("O jogo durou " + t + " horas");
            }

    }
}
