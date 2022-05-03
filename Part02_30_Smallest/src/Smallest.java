import java.util.Scanner;

public class Smallest {
 
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	
    	System.out.println("Please enter a number:");
    	int firstNum = scan.nextInt();
    	
    	System.out.println("Please enter a second number:");
    	int secondNum = scan.nextInt();
    	
        int result = smallest(firstNum, secondNum);
        System.out.println("Smallest: " + result);
    }
    
    public static int smallest(int number1, int number2) {
        if (number1 < number2) {
            return number1;
        } 
        return number2;
    }
}