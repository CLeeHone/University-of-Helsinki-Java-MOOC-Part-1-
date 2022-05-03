import java.util.ArrayList;
import java.util.Scanner;
 
public class RememberTheseNumbers {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numberList = new ArrayList<>();
        
        while (true) {
        	System.out.println("Please enter a number [-1 to exit]:");
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }
            numberList.add(number);
        }
        System.out.println(numberList);
    }
}