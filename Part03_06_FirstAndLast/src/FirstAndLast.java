import java.util.ArrayList;
import java.util.Scanner;
 
public class FirstAndLast {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
 
        while (true) {
        	System.out.println("Please input words [press enter to exit]:");
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            list.add(input);
        }
        System.out.println("String in first index is: " + list.get(0));
        System.out.println("String in last index is: " + list.get(list.size() - 1));
    }
}