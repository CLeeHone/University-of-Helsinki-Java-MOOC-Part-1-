import java.util.Scanner;
 
public class Factorial {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 1;
        int result = 1;
        
        System.out.println("Give a number:");
        int userNumber = Integer.valueOf(scanner.nextLine());
 
        while (counter <= userNumber) {
            result *= counter;
            counter++; 
        }
        System.out.println("Factorial: " + result);
    }
}