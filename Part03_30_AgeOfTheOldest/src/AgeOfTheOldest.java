import java.util.Scanner;
 
public class AgeOfTheOldest {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.println("Print name and age as follows: Name,Age");
        int counter = 0;
        int ageValue = 0;
 
        while (true) {
            String nameAge = scanner.nextLine();
            if (nameAge.equals("")) {
                break;
            }
            String[] parts = nameAge.split(",");
            int ageSplit = Integer.valueOf(parts[1]);
 
            if (ageSplit > ageValue) {
                ageValue = ageSplit;
            }
        }
        System.out.println(ageValue);
    }
}