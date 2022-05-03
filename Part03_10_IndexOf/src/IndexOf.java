import java.util.ArrayList;
import java.util.Scanner;
 
public class IndexOf {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        
        while (true) {
        	System.out.println("Please enter a number [-1 to exit]:");
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }
            list.add(input);
        }
 
        System.out.println("");
 
        // implement here finding the indices of a number
        System.out.println("Search for?");
        int userNumber = Integer.valueOf(scanner.nextLine());
 
        int index = 0;
 
        while (index < list.size()) {
            if (userNumber == list.get(index)) {
                System.out.println(userNumber + " is at index " + index);
            } 
            index++;
        }
    }
}