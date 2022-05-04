import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
 
public class GuestListFromAFile {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        // implement reading the file here.
        // implement scanner for name file
        // transfer name file to arraylist with while loop
        
        try (Scanner nameFile = new Scanner(Paths.get(file))) {
            while (nameFile.hasNextLine()) {
                list.add(nameFile.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
  
        System.out.println("\nEnter names, an empty line quits.");
        while (true) {
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
             String answer = (list.contains(name) ? "The name is on the list." : "The name is not on the list.");
             System.out.println(answer);
        }
        System.out.println("Thank you!");
    }
}