import java.util.Scanner;
 
public class Counting {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        
        System.out.println("Please enter a number:");
        int number = Integer.valueOf(scanner.nextLine());
 
        for (int base = 0; base <= number; base++) {
            System.out.println(base);
        }
    }
}