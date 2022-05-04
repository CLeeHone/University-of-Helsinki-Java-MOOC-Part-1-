import java.util.ArrayList;
import java.util.Scanner;
 
public class PersonalDetails {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print name and birth year as follows: Name,Year");
        
        int sum = 0;
        int counter = 0;
        int yearValue = 0;
        String name = "";
        String longestName = "";
        
        while (true) {
            String nameYear = scanner.nextLine();
            if (nameYear.equals("")) {
                break;
            }
            
            String[] parts = nameYear.split(",");
            int yearSplit = Integer.valueOf(parts[1]);
            name = parts[0];
            sum = sum + yearSplit;
            counter++;
 
            if (name.length() > longestName.length()) {
                longestName = parts[0];
            }            
        }
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + (1.0*sum/counter));
    }
}