import java.util.Scanner;
 
public class OddOrEven {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
  
        System.out.println("Give a number:");
        int givenNumber = Integer.valueOf(scan.nextLine());
        
        if (givenNumber % 2 == 0) {
            System.out.println("Number " + givenNumber + " is even.");
        } else {
            System.out.println("Numer " + givenNumber + " is odd.");
        }
    }
} 