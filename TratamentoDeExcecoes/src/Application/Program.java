package Application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        method1();
        System.out.print("End of program");




    }
    public static void method1() {
        System.out.println("Method 1 Start!!!!");
        method2();
        System.out.println("Method 1 end!!!!");
    }
        public static void method2(){
        System.out.println("Method 2 Start!!!!");
            Scanner sc = new Scanner(System.in);
            Locale.setDefault(Locale.US);
            try {

            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid position!");
            e.printStackTrace();
            sc.next();
        }
            catch(InputMismatchException e){
            System.out.println("Input error!");
        }
            System.out.println("Method 2 end!!!!");
            sc.close();
        }
}
