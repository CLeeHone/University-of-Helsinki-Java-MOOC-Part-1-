 
import java.util.Scanner;
 
public class MainProgram {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise
 
        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
        
        System.out.println("Enter numbers:");
        Statistics sumAllNumbers = new Statistics();
        Statistics sumEvenNumbers = new Statistics();
        Statistics sumOddNumbers = new Statistics();
 
        while (true) {
            int userNumber = Integer.valueOf(scanner.nextLine());
            if (userNumber == -1) {
                break;
            }
            sumAllNumbers.addNumber(userNumber);
            if (userNumber % 2 == 0) {
                sumEvenNumbers.addNumber(userNumber);
            } else {
                sumOddNumbers.addNumber(userNumber);
            }
        }
        System.out.println("Sum: " + sumAllNumbers.sum());
        System.out.println("Sum of even numbers: " + sumEvenNumbers.sum());
        System.out.println("Sum of odd numbers: " + sumOddNumbers.sum());
    }
}