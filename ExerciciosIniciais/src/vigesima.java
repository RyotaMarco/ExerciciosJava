import java.util.Scanner;

public class vigesima {
    public static void main(String[] args) {
        int x,y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a coordenada x: ");
        x = sc.nextInt();
        System.out.println("Informe a coordenada y: ");
        y = sc.nextInt();
        while (x!=0 || y!=0){
            if(x>=0 && y>=0){
                System.out.println("Primeiro");
                System.out.println("Informe a coordenada x: ");
                x = sc.nextInt();
                System.out.println("Informe a coordenada y: ");
                y = sc.nextInt();
            }
            else {
                if(x<0 && y>=0){
                    System.out.println("Segundo");
                    System.out.println("Informe a coordenada x: ");
                    x = sc.nextInt();
                    System.out.println("Informe a coordenada y: ");
                    y = sc.nextInt();
                }
                else{
                    if (x<0 && y<0){
                        System.out.println("Terceiro");
                        System.out.println("Informe a coordenada x: ");
                        x = sc.nextInt();
                        System.out.println("Informe a coordenada y: ");
                        y = sc.nextInt();
                    } else {
                        if (x>=0 && y<0){
                            System.out.println("Quarto");
                            System.out.println("Informe a coordenada x: ");
                            x = sc.nextInt();
                            System.out.println("Informe a coordenada y: ");
                            y = sc.nextInt();
                        }
                    }
                }
            }
        }
    }
}
