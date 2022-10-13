package Application;

import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entrer a folder path: ");
        String strpath = sc.nextLine();

        File path = new File(strpath);

        File[] folders = path.listFiles(File::isDirectory);
        System.out.print("Folders: ");
        for (File folder :folders){
            System.out.println(folder);
        }
        File [] files = path.listFiles(File::isFile);
        for (File file: files){
            System.out.println(file);
        }

        boolean success = new File(strpath + "\\subdir").mkdir();
        System.out.println("Directoy created sucessfully: " + success);
        sc.close();
    }
}
