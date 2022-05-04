import java.util.Scanner;
 
public class LastWords {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        while (true) {
            String words = scanner.nextLine();
 
            if (words.equals("")) {
                break;
            }
 
            int counter = 0;
            String[] wordSplit = words.split(" ");
 
            while (counter < wordSplit.length) {
                if (counter == wordSplit.length - 1) {
                    System.out.println(wordSplit[counter]);
                }
                counter++;
            }
        }
    }
}