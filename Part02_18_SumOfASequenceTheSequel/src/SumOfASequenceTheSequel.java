import java.util.Scanner;
 
public class SumOfASequenceTheSequel {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = 0;
 
        System.out.println("First number?");
        int userFirst = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Last number?");
        int userSecond = Integer.valueOf(scanner.nextLine());
 
        int counter = userFirst;
 
        while (counter <= userSecond) {
            result += counter;
            counter++;
        }
        System.out.println("The sum is " + result);
    }
}