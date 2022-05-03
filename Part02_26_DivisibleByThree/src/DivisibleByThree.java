import java.util.Scanner;
 
public class DivisibleByThree {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.println("Please enter the first number in the range:");
        int beginning = Integer.valueOf(scanner.nextLine());
        System.out.println("Please enter the last number in the range:");
        int end = Integer.valueOf(scanner.nextLine());
 
        divisibleByThreeInRange(beginning, end);
    }
 
    public static void divisibleByThreeInRange(int beginning, int end) {
        int number = beginning;
 
        while (true) {
            if (number > end) {
                break;
            }
            if (number <= end && number % 3 == 0) {
                System.out.println(number);
                number++;
            } else {
                number++;
            }
        }
    }
}