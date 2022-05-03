import java.util.ArrayList;
import java.util.Scanner;
 
public class OnlyTheseNumbers {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbersList = new ArrayList<>();
 
        while (true) {
        	System.out.println("Please enter a number [-1 to exit]:");
            int number = Integer.valueOf(scanner.nextLine());
 
            if (number == -1) {
                break;
            }
            numbersList.add(number);
        }
        
        System.out.println("From where (inclusive)?)");
        int first = Integer.valueOf(scanner.nextLine());
 
        System.out.println("To where (inclusive)?");
        int second = Integer.valueOf(scanner.nextLine());
 
        while (first < (second+1)) {
            System.out.println(numbersList.get(first));
            first++;
        }
    }
}