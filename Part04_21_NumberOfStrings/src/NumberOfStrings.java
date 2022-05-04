import java.util.Scanner;
 
public class NumberOfStrings {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int counter = 0;
        String word;
        
        while (true) {
            word = scanner.nextLine();
            if (word.equals("end")) {
                break;
            }
            counter = counter + 1;
        }
        System.out.println(counter);
    }
}