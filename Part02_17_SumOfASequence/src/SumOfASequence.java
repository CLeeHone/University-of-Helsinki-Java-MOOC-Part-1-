import java.util.Scanner;
 
public class SumOfASequence {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int result = 0;
        
        System.out.println("Last number?");
        int userNumber = Integer.valueOf(scanner.nextLine());
        
        
        while (counter <= userNumber) {
            result += counter;
            counter++;
        }
        System.out.println("The sum is " + result);
    }
}