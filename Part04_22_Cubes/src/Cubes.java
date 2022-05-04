import java.util.Scanner;
 
public class Cubes {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
        	System.out.println("Please enter a number [end to exit]:");
            String stringNumber = scanner.nextLine();
            if (stringNumber.equals("end")) {
                break;
            }
            
            int intNumber = Integer.valueOf(stringNumber);
            System.out.println(Math.pow(intNumber, 3));
        }
    }
}