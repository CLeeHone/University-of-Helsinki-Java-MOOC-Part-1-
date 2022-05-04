import java.util.Scanner;
 
public class LiquidContainers2 {
 
    public static void main(String[] args) {
 
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();
 
        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);
 
            System.out.println("\nPleaser enter 'add', 'move', or 'remove' to change values in the first and second containers.\nEnter 'quit' to exit program:");
 
            System.out.print("> ");
 
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
 
            if (command.equalsIgnoreCase("add")) {
                first.add(amount);
            }
 
            if (command.equalsIgnoreCase("move")) {
            	if (amount > first.contains()) {
            		amount = first.contains();
            	}        	
            	first.remove(amount);
            	second.add(amount);
            }
 
            if (command.equalsIgnoreCase("remove")) {
            	second.remove(amount);
            }
        }
    }
}