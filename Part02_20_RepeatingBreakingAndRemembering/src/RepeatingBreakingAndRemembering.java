import java.util.Scanner;
 
public class RepeatingBreakingAndRemembering {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int sum = 0;
        int evenNum = 0;
        int oddNum = 0;
        
        System.out.println("Give numbers [-1 to exit]:");
        
        while (true) {         
            int userNumber = Integer.valueOf(scanner.nextLine());
 
            if (userNumber == -1) {
                System.out.println("Thanks! Bye!");
                break;
            } else {
                counter++;
                sum += userNumber;
            }
            if (userNumber % 2 == 0) {
                evenNum++;
            } else {
                oddNum++;
            }
            
        }
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + counter);
        System.out.println("Average: " + ((1.0 * sum)/(1.0 * counter)));
        System.out.println("Even: " + evenNum);
        System.out.println("Odd: " + oddNum);
    }
}