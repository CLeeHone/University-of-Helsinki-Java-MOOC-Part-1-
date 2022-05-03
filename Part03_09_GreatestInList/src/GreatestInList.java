import java.util.ArrayList;
import java.util.Scanner;
 
public class GreatestInList {
 
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
      
        // implement finding the greatest number in the list here
        int largest  = list.get(0);
        
        for (int i = 0; i < list.size(); i++) {
            int number = list.get(i);
            if(largest < number) {
                largest = number;
            }
        }
        System.out.println("\nThe greatest number : " + largest);
    }
}