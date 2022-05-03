import java.util.Scanner;
 
public class NumberOfNegativeNumbers {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        
        while (true) { 
            System.out.println("Give a number [0 to exit]:");
            int loopNumber = Integer.valueOf(scanner.nextLine());
            
            if (loopNumber < 0) {        
                number++;
            }
            if (loopNumber == 0) {
                break;
            }
        }
        System.out.println("Number of negative numbers: " + number);
    }
}
 