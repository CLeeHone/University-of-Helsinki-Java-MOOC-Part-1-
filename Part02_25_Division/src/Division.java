import java.util.Scanner;

public class Division {
 
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	
        System.out.println("Please enter the numerator:");
        int numerator = scanner.nextInt();
        System.out.println("Please enter the denominator:");
        int denominator = scanner.nextInt();
        
        division (numerator, denominator);
    }
 
    public static void division (int numerator, int denominator) {
        System.out.println((1.0 * numerator) / (1.0 * denominator));
    }
}