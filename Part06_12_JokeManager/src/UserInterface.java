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
    private JokeManager manager;
    private Scanner scanner;
 
    //constructor, 2 parameters
    public UserInterface(JokeManager manager, Scanner scanner) {
        this.manager = manager;
        this.scanner = scanner;
    }
 
    public void start() {
        while (true) {
            System.out.println("Commands:");
            System.out.println("1 - add a joke");
            System.out.println("2 - draw a joke");
            System.out.println("3 - list jokes");
            System.out.println("X - stop");
            String command = scanner.nextLine();
            
            if (command.contains("X")) {
                break;
            }
            if (command.contains("1")) {
                System.out.println("Write the joke to be added:");
                String jokeToAdd = scanner.nextLine();
                manager.addJoke(jokeToAdd);
            }
            if (command.contains("2")) {
                System.out.println(manager.drawJoke());
            }
            if (command.contains("3")) {
                manager.printJokes();
            }
        }
    }
}