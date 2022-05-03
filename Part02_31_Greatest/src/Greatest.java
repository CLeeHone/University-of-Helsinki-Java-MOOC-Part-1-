import java.util.Scanner;

public class Greatest {
	
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	
    	System.out.println("Please enter a number:");
        int firstNum = scan.nextInt();
        
        System.out.println("Please enter a second number:");
    	int secondNum = scan.nextInt();
    	
    	System.out.println("Please enter a third number:");
    	int thirdNum = scan.nextInt();
    	
        int result = greatest(firstNum, secondNum, thirdNum);
        System.out.println("Greatest: " + result);
    }
 
    public static int greatest(int number1, int number2, int number3) {

    	if (number1 > number2 && number1 > number3) {
            return number1;
 
        } else if (number1 > number2 && number1 < number3) {
            return number3;
 
        } else if (number1 < number2 && number1 > number3) {
            return number2;
 
        } else if (number2 > number1 && number2 > number3) {
            return number2;
 
        } else if (number2 > number1 && number2 < number3) {
            return number3;
 
        } else if (number2 < number1 && number2 > number3) {
            return number1;
 
        } else if (number3 > number1 && number3 > number2) {
            return number3;
 
        } else if (number3 > number1 && number3 < number2) {
            return number2;
        } else {
            return number1;
        }
    }
}
 