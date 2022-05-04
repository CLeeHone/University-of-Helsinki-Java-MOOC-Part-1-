import java.util.ArrayList;
import java.util.Scanner;

public class Sum {
 
    public static int sum(ArrayList<Integer> numbers) {
        int sum = 0;

        if (numbers.isEmpty()) {
            return -1;
        }
         
        for (int number : numbers) {
            sum = sum + number;
        }
        return sum;
    }
 
    public static void main(String[] args) {
        // Try your method here
        ArrayList<Integer> numbers = new ArrayList<> ();
        Scanner scanner = new Scanner(System.in);
        int userNumber = 0;
        
        while (true) {
        	System.out.println("Please enter a number [9999 to exit]");
	        userNumber = scanner.nextInt();
	        if (userNumber != 9999) {
	        	numbers.add(userNumber);
	        } else {
	        	break;
	        }
        }
        System.out.println(sum(numbers));
    }
}