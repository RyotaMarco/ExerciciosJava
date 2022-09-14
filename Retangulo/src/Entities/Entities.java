package Entities;
import java.lang.Math;
public class Entities {

    public double width;

    public double height;

    public double area(){
        return width * height;
    }
    public double perimeter(){
        return 2 * (width + height);

    }
    public double diagonal(){
    return Math.sqrt((width * width) + (height * height));
    }


    public String toString() {
        return   "area: " + area()+ " " + "Perimeter: " + perimeter()+ " " + " Diagonal: " + diagonal();
    }
}
