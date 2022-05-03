import java.util.Scanner;
 
public class AverageOfPositiveNumbers {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberCount = 0;
        int numberSum = 0;
        
        while (true) {
            System.out.println("Give a number [0 to exit]:");
            int userNumber = Integer.valueOf(scanner.nextLine());
            
            if (userNumber == 0) {
                break;
            }
            if (userNumber > 0) {
                numberCount++;
                numberSum += userNumber;
            }
        }
        
        if (numberCount == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println((1.0 * numberSum) / (1.0 * numberCount));
        }
    }
}