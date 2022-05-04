import java.util.Scanner;
 
public class AVClub {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        while (true) {
            String words = scanner.nextLine();
            String[] wordSmith = words.split(" ");
            
            if (words.length() == 0) {
                break;
            }
            for (int i = 0; i < wordSmith.length; i++) {
                if (wordSmith[i].contains("av")) {
                    System.out.println(wordSmith[i]);
                }
            }
        }
    }
}