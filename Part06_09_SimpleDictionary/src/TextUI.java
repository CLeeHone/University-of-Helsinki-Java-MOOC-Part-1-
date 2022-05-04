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
 
public class TextUI {
    //instance variables
    private Scanner scanner;
    private SimpleDictionary book;
    
    
    //constructor
    public TextUI(Scanner scanner, SimpleDictionary book) {
        this.scanner = scanner;
        this.book = book;
    }
    
    //methods
    public void start() {
        String command = "";
        
        while (!command.equalsIgnoreCase("end")) {
            System.out.println("Command [add, search, end]:");
            command = scanner.nextLine();
            
            if (command.equalsIgnoreCase("end")) {
                System.out.println("Bye bye!");
                break;  
            } else if (command.contains("add")) {
                System.out.println("Word:");
                String word = scanner.nextLine();
                System.out.println("Translation:");
                String translation = scanner.nextLine();
                book.add(word, translation);
                
            } else if (command.contains("search")) {
                System.out.println("To be translated:");
                String toTranslate = scanner.nextLine();
                if (book.translate(toTranslate) == null) {
                    System.out.println("Word " + toTranslate + " was not found.");
                } else {
                System.out.println(book.translate(toTranslate));
                }
            } else {
            	System.out.println("Unknown command");
            }
        }
    }
}
 