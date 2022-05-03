import java.util.Scanner;

public class FromParameterToOne {
 
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	
    	System.out.println("Please enter a number:");
    	int userNumber = scanner.nextInt();
        printFromNumberToOne(userNumber);
    }
    public static void printFromNumberToOne(int number) {
        while (number >= 1) {
            System.out.println(number);
            number--;
        }
    }
}