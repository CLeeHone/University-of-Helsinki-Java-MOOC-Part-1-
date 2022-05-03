import java.util.Scanner;
 
public class DifferentTypesOfInput {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
 
        System.out.println("Give a string:");
        String giveString = scan.nextLine();
        
        System.out.println("Give an integer:"); 
        int giveInteger = Integer.valueOf(scan.nextLine());
        
        System.out.println("Give a double:");
        double giveDouble = Double.valueOf(scan.nextLine());
        
        System.out.println("Give a boolean:");
        boolean giveBoolean = Boolean.valueOf(scan.nextLine());
        
        System.out.println("You gave the string " + giveString);
        System.out.println("You gave the integer " + giveInteger);
        System.out.println("You gave the double " + giveDouble);
        System.out.println("You gave the boolean " + giveBoolean);
    }
}