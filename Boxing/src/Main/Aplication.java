package Main;

import java.util.Locale;

public class Aplication {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        int x = 20;
        Object obj = x;
        System.out.println(obj);
        int y = (int) obj;
        System.out.println(y);
    }
}
