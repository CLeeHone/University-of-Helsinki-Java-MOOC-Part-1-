import java.util.Scanner;
 
public class NumberAndSumOfNumbers {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberCount = 0;
        int numberSum = 0;
 
        while (true) {
            System.out.println("Give a number [0 to exit]:");
            int loopNumber = Integer.valueOf(scanner.nextLine());
 
            if (loopNumber == 0) {
                break;
            }
            if (loopNumber != 0) {
                numberCount += 1;
            }
            numberSum += loopNumber;
        }
        System.out.println("Number of numbers: " + numberCount);
        System.out.println("Sum of the numbers: " + numberSum);
    }
}