package Application;

import Entites.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        String path = "C:\\Users\\lokpe\\Documents\\Teste\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {


            String employeeCSV = br.readLine();
            while (employeeCSV != null) {
                String[] fields = employeeCSV.split(",");
                list.add(new Employee(fields[0], Double.parseDouble(fields[1])));
                employeeCSV = br.readLine();
            }
            Collections.sort(list);
            for (Employee emp : list) {
                System.out.println(emp.getName() + ", " +  emp.getSalary());
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
