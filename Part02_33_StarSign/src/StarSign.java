public class StarSign {
 
    public static void main(String[] args) {
        printStars(3);
        System.out.println("\n---");  // printing --- between the shapes
 
        printSquare(4);
        System.out.println("\n---");
 
        printRectangle(5, 6);
        System.out.println("\n---");
 
        printTriangle(3);
        System.out.println("\n---");
 
    }
 
    public static void printStars(int number) {
        // first part of the exercise
        int stars = 1;
        while (stars <= number) {
            System.out.print("*");
            stars++;
        }
        System.out.println("");
    }
 
    public static void printSquare(int size) {
        // second part of the exercise
        int width = 1;
        while (width <= size) {
            printStars(size);
            width++;
        }
    }
 
    public static void printRectangle(int width, int height) {
        // third part of the exercise
        int counterWidth = 0;
        int counterHeight = 1;
        while (counterWidth <= width && counterHeight <= height) {
            printStars(width);
            counterWidth++;
            counterHeight++;
        }
    }
 
    public static void printTriangle(int size) {
        // fourth part of the exercise
        int counter = 1;
        while (counter <= size) {
            printStars(counter);
            counter++;
        }
    }
}