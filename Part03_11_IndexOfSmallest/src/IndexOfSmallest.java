import java.util.ArrayList;
import java.util.Scanner;
 
public class IndexOfSmallest {
 
    public static void main(String[] args) {
        // implement here a program that reads user input
        // until the user enters 9999
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
 
        while (true) {
        	System.out.println("Please enter a number [9999 to exit]:");
            int input = Integer.valueOf(scanner.nextLine());
 
            if (input == 9999) {
                break;
            } else {
                list.add(input);
            }
        }
 
        int smallest = list.get(0);
        int index = 0;
 
        for (int i = 0; i < list.size(); i++) {
            int number = list.get(i);
            if (smallest > number) {
                smallest = number;
            }
        }
 
        while (index < list.size()) {
            if (smallest == list.get(index)) {
                break;
            } else {
                index++;
            }
        }
        System.out.println("Smallest number: " + smallest);
        System.out.println("Found at index: " + index);
    }
}