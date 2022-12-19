package Application;

import Entities.Product;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.0));
        list.add(new Product("Notebook", 1200.0));
        list.add(new Product("Tablet", 400.0));

        list.sort(new MyComparator());

        for (Product p : list){
            System.out.println(p);
        }
    }
}

