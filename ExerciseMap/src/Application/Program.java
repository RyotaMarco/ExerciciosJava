package Application;



import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);


        Map<String, Integer> count = new LinkedHashMap<>();

        System.out.print("Enter file full path: ");
        String path = sc.nextLine();

        try(BufferedReader br = new BufferedReader( new FileReader(path))){


            String line = br.readLine();

           while (line != null){
                String [] fields = line.split(",");
                String name = fields [0];
                int vote = Integer.parseInt(fields [1]);

                if (count.containsKey(name)){
                    int countsValue = count.get(name);
                    count.put(name, vote + countsValue);
                }
                else{
                    count.put(name, vote);
                }
                line = br.readLine();

            }
            for (String key : count.keySet()) {
                System.out.println(key + ": " + count.get(key));
            }





        } catch (IOException e) {
           System.out.println("Error: " + e.getMessage());
        }

    }
}
