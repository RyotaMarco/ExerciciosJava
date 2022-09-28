package Application;

import Entities.EnumEntities.Color;
import Entities.Rectangle;
import Entities.Shape;
import Entities.Circle;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        List<Shape> list = new ArrayList<>();

        System.out.println("Enter the number of shapes: ");
        int n = sc.nextInt();

        for (int i = 1;i<=n;i++){
            System.out.println("Shape #" + i + " data:");
            System.out.println("Rectangle or Circle(r/c):");
            char ch = sc.next().charAt(0);
            System.out.println("Color(BLACK/BLUE/RED)?");
            Color color = Color.valueOf(sc.next());
            if (ch == 'r'){
                System.out.println("width:");
                double width = sc.nextDouble();
                System.out.println("Height");
                double height = sc.nextDouble();
                list.add(new Rectangle(color,width,height));
            }
           else{
                System.out.println("Radius: ");
                double radius = sc.nextDouble();
                list.add(new Circle(color,radius));
            }
        }
        System.out.println();
        System.out.println("Shape areas: ");
        for (Shape shape : list){
            System.out.println(String.format("%.2f", shape.area() ));
        }



        sc.close();
    }
}
