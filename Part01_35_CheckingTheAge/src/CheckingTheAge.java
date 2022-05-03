import java.util.Scanner;
 
public class CheckingTheAge {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("How old are you?");
        double givenAge = Double.valueOf(scan.nextLine());
        
        if (givenAge >= 0 && givenAge <= 120) {
            System.out.println("OK");
        } else {
            System.out.println("Impossible!");
        }
    }
}