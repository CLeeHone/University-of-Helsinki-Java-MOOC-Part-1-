import java.util.Scanner;
 
public class Reprint {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    	int counter = 0;

    	System.out.println("How many times should the text be printed?");
        int userNumber = Integer.valueOf(scanner.nextLine());
        
        while (counter < userNumber) {
            printText();
            counter++;
        }
    }
    
    public static void printText() {
        System.out.println("In a hole in the ground there lived a method");
    }
}