import java.util.Scanner;
 
public class AverageOfNumbers {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberAverageCount = 0;
        int numberAverageSum = 0;
 
        while (true) {
            System.out.println("Give a number [0 to exit]:");
            int givenNumber = Integer.valueOf(scanner.nextLine());
 
            if (givenNumber == 0) {
                break;
            } else {
                numberAverageCount++;
                numberAverageSum += givenNumber;
            }
        }
        System.out.println("Average of the numbers: " + ((1.0*numberAverageSum)/(1.0*numberAverageCount)));
    }
}
 