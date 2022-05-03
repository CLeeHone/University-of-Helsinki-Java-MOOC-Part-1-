import java.util.Scanner;
 
public class CountingToHundred {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please enter a number smaller than 100:");
        int number = Integer.valueOf(scanner.nextLine());
 
        for (int counter = number; counter <= 100; counter++) {
            System.out.println(counter);
        }
    }
}