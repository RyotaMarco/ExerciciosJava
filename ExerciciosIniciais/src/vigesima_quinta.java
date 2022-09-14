import java.util.Scanner;

public class vigesima_quinta {
    public static void main(String[] args) {
        int n,x;
        double p1,p2,p3,m,p11,p21,p31,p12,p22,p32,v,b;
        m = 0;
        b = 0;
        v = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o numero de casos: ");
        x = sc.nextInt();
        for (n=1;n<=x;n++){
            if (n==1){
                p1 = sc.nextDouble();
                p2 = sc.nextDouble();
                p3 = sc.nextDouble();
                m = ((p1*2)+(p2*3)+(p3*5))/10;
            } else{
                if(n==2){
                    p11 = sc.nextDouble();
                    p21 = sc.nextDouble();
                    p31 = sc.nextDouble();
                    b = ((p11*2)+(p21*3)+(p31*5))/10;
                } else{
                    if (n == 3) {
                        p12 = sc.nextDouble();
                        p22 = sc.nextDouble();
                        p32 = sc.nextDouble();
                        v = ((p12*2)+(p22*3)+(p32*5))/10;
                    }
                }
            }


        }
        System.out.printf("A media e: %.1f%n",m);
        System.out.printf("%.1f%n",b);
        System.out.printf("%.1f%n",v);
    }
}
