import java.util.Scanner;
 
public class GradesAndPoints {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Give points [0-100]:");
        
        double pointsGiven = Double.valueOf(scan.nextLine());
        
        if (pointsGiven < 0) {
            System.out.println("Impossible!");
        } else if (pointsGiven >= 0 && pointsGiven < 50) {
            System.out.println("failed");
        } else if (pointsGiven >= 50 && pointsGiven < 60) {
            System.out.println("1");
        } else if (pointsGiven >= 60 && pointsGiven < 70) {
            System.out.println("2");
        } else if (pointsGiven >= 70 && pointsGiven < 80) {
            System.out.println("3");
        } else if (pointsGiven >= 80 && pointsGiven < 90) {
            System.out.println("4");
        } else if (pointsGiven >= 90 && pointsGiven <= 100) {
            System.out.println("5");
        } else {
            System.out.println("incredible!");
        }
    }
}