import java.util.Scanner;
 
public class LiquidContainers {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;
 
        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
 
            System.out.println("\nPleaser enter 'add', 'move', or 'remove' to change values in the first and second containers.\nEnter 'quit' to exit program:");
            
            System.out.print("> ");
            String input = scan.nextLine();
            
            if (input.equalsIgnoreCase("quit")) {
                break;
            }
 
            if (input.contains("add")) {
                String[] parts = input.split(" ");
                String command = parts[0];
                int amount = Integer.valueOf(parts[1]);
 
                if (amount < 0) {
                    continue;
                }
 
                if (first + amount <= 100) {
                    first += amount;
                } else {
                    first = 100;
                }
            }
 
            if (input.contains("move")) {
                String[] parts = input.split(" ");
                String command = parts[0];
                int amount = Integer.valueOf(parts[1]);
 
                if (amount < 0) {
                    continue;
                }
 
                if (first - amount < 0) {
                    if ((second + first) <= 100) {
                        second += first;
                        first = 0;
                    } else {
                        second = 100;
                        first = 0;
                    }
                } else {
                    if (second + amount <= 100) {
                        first -= amount;
                        second += amount;
                    } else {
                        first -= amount;
                        second = 100;
                    }
                }
            }
 
            if (input.contains("remove")) {
                String[] parts = input.split(" ");
                String command = parts[0];
                int amount = Integer.valueOf(parts[1]);
 
                if (amount < 0) {
                    continue;
                }
 
                if ((second - amount) > 0) {
                    second -= amount;
                } else {
                    second = 0;
                }
            }
        }
    }
}