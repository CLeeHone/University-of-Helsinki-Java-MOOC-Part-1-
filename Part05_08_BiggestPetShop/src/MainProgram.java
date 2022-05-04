 import java.util.Scanner;
 
public class MainProgram {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
 
        Pet fluffy = new Pet("Fluffy", "Golden retriever");
        Person leo = new Person("Leo", fluffy);
 
        System.out.println(leo);
    }
}