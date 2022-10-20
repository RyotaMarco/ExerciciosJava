package Application;


import Entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<Product> list = new ArrayList<>();

        System.out.println("Enter a file path: ");
        String strPath = sc.nextLine();

        File strFile = new File(strPath);
        String finalDestiny = strFile.getParent();

        boolean gotIt = new File(finalDestiny + "\\out").mkdir();
        System.out.println("Directory created: " + gotIt);

        String summary = finalDestiny + "\\out\\summary.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(strFile))) {
            String csv = br.readLine();


            while (csv != null) {


                String[] colunas = csv.split(",", 3);

                String produto = colunas[0].trim();
                Double valor = Double.valueOf(colunas[1].trim());
                Integer quantidade = Integer.valueOf(colunas[2].trim());
                System.out.println(produto + ", " + valor + ", " + quantidade);
                Product product = new Product(produto, valor, quantidade);
                list.add(product);
                csv = br.readLine();
            }
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(summary))) {
                for (Product value : list) {
                    bw.write(value.getName() + ", " + value.total());
                    bw.newLine();
                }

            }

        } catch (NullPointerException e) {
            sc.close();
        } catch (IOException e) {
            System.out.println("Error" + e.getMessage());
        }


        sc.close();
    }
}
