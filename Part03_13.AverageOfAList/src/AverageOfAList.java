import java.util.ArrayList;
import java.util.Scanner;
 
public class AverageOfAList {
 
    public static void main(String[] args) { 
        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        
        while (true) {
        	System.out.println("Please enter a number [-1 to exit]:");
            int userInput = scanner.nextInt();
            if (userInput == -1) {
                break;
            }
            list.add(userInput);
        }
        
        int average = 0;
        for (Integer number: list) {
            average += number;
        }
        
        System.out.println((1.0 * average)/list.size());
    }
}
 