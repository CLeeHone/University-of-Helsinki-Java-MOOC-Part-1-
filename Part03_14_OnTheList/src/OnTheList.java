 
import java.util.ArrayList;
import java.util.Scanner;
 
public class OnTheList {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        
        while (true) {
        	System.out.println("Please enter a word [press enter to exit]:");
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            list.add(input);
        }
        System.out.println("Search for?");
        String word = scanner.nextLine();
        
        if (list.contains(word)) {
            System.out.println(word + " was found!");
        } else {
            System.out.println( word + "was not found!");
        }
    }
}