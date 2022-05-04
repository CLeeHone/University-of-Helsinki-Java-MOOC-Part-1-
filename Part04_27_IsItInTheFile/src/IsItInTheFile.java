import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;
 
public class IsItInTheFile {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
 
        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        try (Scanner fileName = new Scanner(Paths.get(file))) {
            while (fileName.hasNextLine()) {
                list.add(fileName.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed");
        }
 
        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        
        while(true) {
            if (searchedFor.isEmpty()){
                break;
            }
            String answer = (list.contains(searchedFor) ? "Found!" : "Not found");
            System.out.println(answer);
            break;
        }
    }
}