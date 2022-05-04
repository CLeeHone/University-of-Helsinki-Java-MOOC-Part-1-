import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
         ToDoList list = new ToDoList();
        Scanner scanner = new Scanner(System.in);
 
        UserInterface ui = new UserInterface(list, scanner);
        ui.start();
        list.print();
    }
}