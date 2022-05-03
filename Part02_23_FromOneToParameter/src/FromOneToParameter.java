import java.util.Scanner;

public class FromOneToParameter {
 
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	
    	System.out.println("Please enter a number:");
    	int userNumber = scanner.nextInt();
        printUntilNumber(userNumber);
    }
 
    public static void printUntilNumber(int number) {
        int i = 1;
        while (i <= number) {
            System.out.println(i);
            i++;
        }
    }
}