package Application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {

        String path =  "c:\\Users\\lokpe\\Documents\\Teste\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            
            String line = br.readLine();

            while(line != null){
                System.out.print(line);
                line= br.readLine();
            }
        }
        catch (IOException e ){
            System.out.print("Error: " + e.getMessage());
        }
    }
}
