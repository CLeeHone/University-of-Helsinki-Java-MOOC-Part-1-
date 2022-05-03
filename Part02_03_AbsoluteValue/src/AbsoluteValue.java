import java.util.Scanner;
 
public class AbsoluteValue {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int givenNumber = Integer.valueOf(scanner.nextLine());
        
        if (givenNumber < 0) {
            System.out.println(givenNumber * -1);
        } else {
            System.out.println(givenNumber);
        }
    }
}