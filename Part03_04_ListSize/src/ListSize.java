import java.util.ArrayList;
import java.util.Scanner;
 
public class ListSize {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        
        while (true) {
        	System.out.println("Please enter words [press enter to exit]:");
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            list.add(input);
        }
        
        System.out.println("In total: " + list.size());
    }
}