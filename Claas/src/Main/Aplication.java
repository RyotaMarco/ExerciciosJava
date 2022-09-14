package Main;

import Entities.Entities;

import java.util.Locale;
import java.util.Scanner;

public class Aplication {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Entities Entities = new Entities();
        System.out.println("Enter student data ");
        System.out.println("Name: ");
        Entities.name = sc.nextLine();

        System.out.println("Grade 1: ");
        Entities.grade1 = sc.nextDouble();

        System.out.println("Grade 2: ");
        Entities.grade2 = sc.nextDouble();

        System.out.println("Grade 3: ");
        Entities.grade3 = sc.nextDouble();

        System.out.printf("Final grade: %.2f%n", Entities.student());

        if (Entities.student()<60){
            System.out.println("Failed");
            System.out.printf("Missing %.2f Points%n ", Entities.finalGrade());
        }
    }
}
