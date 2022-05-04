import java.util.ArrayList;
import java.util.Scanner;
 
public class PrintInRange {
 
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        int number = 0;
        
        while (number != 9999) {
        	System.out.println("Please enter a number [9999 to exit]");
        	number = scanner.nextInt();
        	numbers.add(number);
        }
        System.out.println("Please enter the first number in the range (inclusive):");
        int firstNum = scanner.nextInt();
        
        System.out.println("Please enter the first number in the range (inclusive):");
        int secondNum = scanner.nextInt();
        
        System.out.println("Print numbers in the range [" + firstNum + ", " + secondNum + "]");
        printNumbersInRange(numbers, firstNum, secondNum);
    }
    
    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
        for (int number : numbers) {
            if (number >= lowerLimit && number <= upperLimit) {
                System.out.println(number);
            }
        }
    }
}