 
import java.util.ArrayList;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        // implement here the program that allows the user to enter 
        // book information and to examine them
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> bookList = new ArrayList<>();
 
        while (true) {
            System.out.println("Title: ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }
            System.out.println("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
 
            System.out.println("Publication year: ");
            int year = Integer.valueOf(scanner.nextLine());
 
            bookList.add(new Book(title, pages, year));
        }
        System.out.println("What information will be printed?");
        String answer = scanner.nextLine();
 
        if (answer.contentEquals("everything")) {
            for (int i = 0; i < bookList.size(); i++) {
                System.out.println(bookList.get(i).getTitle() + ", " + bookList.get(i).getPages() + " pages, " + bookList.get(i).getYear());
            }
        }
 
        if (answer.contentEquals("name")) {
            for (int i = 0; i < bookList.size(); i++) {
                System.out.println(bookList.get(i).getTitle());
            }
        }
    }
}