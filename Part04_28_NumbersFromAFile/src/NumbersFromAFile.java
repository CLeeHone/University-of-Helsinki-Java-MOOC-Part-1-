import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;
 
public class NumbersFromAFile {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numberList = new ArrayList<>();
        int numberCounter = 0;
        int listCounter = 0;
 
        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = scanner.nextInt();
        System.out.print("Upper bound? ");
        int upperBound = scanner.nextInt();
 
        try (Scanner numberScanner = new Scanner(Paths.get(file))) {
            while (numberScanner.hasNextInt()) {
                numberList.add(numberScanner.nextInt());
                if (numberList.get(listCounter) <= upperBound && numberList.get(listCounter) >= lowerBound) {
                    numberCounter++;
                } 
                listCounter++;
            }
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
        System.out.println("Numbers: " + numberCounter);
    }
}