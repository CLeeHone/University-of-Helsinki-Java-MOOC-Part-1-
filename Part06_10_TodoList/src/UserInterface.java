/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author chloe
 */
import java.util.Scanner;
 
public class UserInterface {
 
    //instance variables
    private ToDoList list;
    private Scanner scanner;
 
    //constructor
    public UserInterface(ToDoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }
 
    //methods
    public void start() {
        while (true) {
            System.out.println("Command [add, remove, list, stop]:");
            String command = scanner.nextLine();
            
            if (command.contains("stop")) {
                break;
            }
            
            if (command.contains("add")) {
                System.out.println("To add:");
                String task = scanner.nextLine();
                list.add(task);
            }
            
            if (command.contains("list")) {
                list.print();
            }
            
            if (command.contains("remove")) {
                System.out.println("Which one is removed?");
                int number = Integer.valueOf(scanner.nextLine());
                list.remove(number);
            }
        }
        
    }
}
 