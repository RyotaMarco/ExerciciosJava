package Application;

import Entities.UsersCode;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("How many students for course A:");
        int a = sc.nextInt();

        Set<UsersCode> set = new HashSet<>();
        for (int i = 0; i < a; i++){
        int code = sc.nextInt();
        set.add(new UsersCode(code));
        }

        System.out.print("How many students for course B:");
        int b = sc.nextInt();

        for (int i = 0; i < b; i++){
            int code = sc.nextInt();
            set.add(new UsersCode(code));
        }

        System.out.print("How many students for course C:");
        int c = sc.nextInt();

        for (int i = 0; i < c; i++){
            int code = sc.nextInt();
            set.add(new UsersCode(code));
        }

        System.out.println("Total students: " + set.size());
    }
}
