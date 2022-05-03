import java.util.Scanner;

public class Averaging {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the first number:");
        int num1 = scan.nextInt();
        
        System.out.println("Please enter the second number:");
        int num2 = scan.nextInt();
        
        System.out.println("Please enter the third number:");
        int num3 = scan.nextInt();
        
        System.out.println("Please enter the fourth number:");
        int num4 = scan.nextInt();
        
        double result = average(num1, num2, num3, num4);
        System.out.println("Average: " + result);
    }
    
    public static int sum(int number1, int number2, int number3, int number4) {
        int sumNumbers = number1 + number2 + number3 + number4;
        return sumNumbers;
    }
 
    public static double average(int number1, int number2, int number3, int number4) {
        double averageNumbers = (1.0 * (number1 + number2 + number3 + number4)) / 4;
        return averageNumbers;
    }
}