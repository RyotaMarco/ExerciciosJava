package Aplication;

import Entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        List<Employee> list = new ArrayList<>();

        System.out.print("How many employee will be registered? ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {


            System.out.printf("Employee #%d:\n", i + 1);
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();
            Employee employee = new Employee(id,name,salary);
            list.add(employee);

        }
        System.out.print("Enter the employee id that will have salary increase: ");
        int increase = sc.nextInt();






        Employee filtro = list.stream().filter(x-> x.getId() ==increase).findFirst().orElse(null);

        if (filtro == null){
            System.out.println("This id does not exist!");
        }
        else {
            System.out.print("Enter the percentege:");
            double percentage = sc.nextDouble();
            filtro.increasesalary(percentage);
        }
        System.out.println("List of employees: ");
        for (Employee x : list) {

            System.out.println(x);
        }


    }



    }

