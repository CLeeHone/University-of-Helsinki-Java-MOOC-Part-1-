import java.util.Scanner;
 
public class FromWhereToWhere {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.println("Where to?");
        int numberFirst = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Where from?");
        int numberSecond = Integer.valueOf(scanner.nextLine());
        
        for (int counter = numberSecond; counter <= numberFirst; counter++) {
            System.out.println(counter);
        }
    }
}