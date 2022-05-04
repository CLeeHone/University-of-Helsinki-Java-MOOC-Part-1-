import java.util.ArrayList;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> identifierList = new ArrayList<>();
        ArrayList<String> nameList = new ArrayList<>();
        int identifierCounter = 0;
        int nameCounter = 0;
 
        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            if (identifier.isEmpty()) {
                break;
            }
            if (identifierList.contains(identifier)) {
                System.out.println("Identifier is already on the list! Not added");
            }
 
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (identifier.isEmpty()) {
                break;
            }
            if (name.isEmpty()) {
                break;
            } else {
                if (!(identifierList.contains(identifier))) {
                    identifierList.add(identifier);
                    nameList.add(name);
                }
            }
        }
 
        while (identifierCounter < identifierList.size()) {
            if (identifierCounter == nameCounter) {
                System.out.println(identifierList.get(identifierCounter) + ": " + nameList.get(nameCounter));
                identifierCounter++;
                nameCounter++;
            } else {
                break;
            }
        }
    }
}