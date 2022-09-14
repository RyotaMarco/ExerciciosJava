package Aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Jose");
        list.add("JAS");
        list.add("CAAC");
        list.add("DSDSD");
        list.add("WAWD");
        list.add(2,"Marco");

        System.out.println(list.size());

        for(String x : list ){
            System.out.println(x);
        }
        System.out.println("===============");

        list.removeIf(x-> x.charAt(0)=='M');
        for(String x : list ){
            System.out.println(x);
        }
        System.out.println("Index of Marco: " + list.indexOf("Marco"));

        List<String> result = list.stream().filter(x-> x.charAt(0)== 'J').collect(Collectors.toList());
        for(String x : result ){
            System.out.println(x);
        }
        System.out.println("============");

        String name = list.stream().filter(x->x.charAt(0)== 'N').findFirst().orElse(null);
        System.out.println(name);
    }
}
