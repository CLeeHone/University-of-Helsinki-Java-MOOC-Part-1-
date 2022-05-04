 
import java.util.Scanner;
 
public class Program {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        // Experiment with your program here
        Cube cube1 = new Cube(4);
        System.out.println(cube1.volume());
        System.out.println(cube1 + "\n");
 
 
        Cube cube2 = new Cube(2);
        System.out.println(cube2.volume());
        System.out.println(cube2 + "\n");
        
        Cube cube3 = new Cube(3); 
        System.out.println(cube3.toString());
    }
}