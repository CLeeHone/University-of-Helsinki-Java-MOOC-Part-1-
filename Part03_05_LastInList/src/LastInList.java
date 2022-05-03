import java.util.ArrayList;
import java.util.Scanner;
 
public class LastInList {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        int index = -1;
        
        while (true) {
            System.out.println("Please enter words [press enter to exit]:");
        	String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            list.add(input);
            index++;
        }
        System.out.println("Last index contains the following String: " + list.get(index));
    }
}