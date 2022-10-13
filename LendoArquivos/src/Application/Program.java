package Application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        File file  = new File("c:\\Users\\lokpe\\Documents\\Teste\\in.txt");
        Scanner sc = null;
        try{
            sc = new Scanner(file);
            while (sc.hasNextLine()){
                System.out.print(sc.nextLine());
            }

        }
        catch(IOException e){
            System.out.print("Error: "  + e.getMessage());
        }
        finally {
            if (sc != null){
                sc.close();
            }

        }
    }
}
