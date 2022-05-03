public class AdvancedAstrology {
 
    public static void printStars(int number) {
        int stars = 1;
 
        while (stars <= number) {
            System.out.print("*");
            stars++;
        }
        System.out.println("");
    }
 
    public static void printSpaces(int number) {
        // part 1 of the exercise
        int spaceCounter = 1;
 
        while (spaceCounter <= number) {
            System.out.print(" ");
            spaceCounter++;
        }
    }
 
    public static void printTriangle(int size) {
        // part 2 of the exercise
        int spaceCounter = size - 1;
        int starCounter = 1;
 
        while (starCounter <= size) {
            printSpaces(spaceCounter);
            printStars(starCounter);
            spaceCounter--;
            starCounter++;
        }
    }
 
    public static void christmasTree(int height) {
        // part 3 of the exercise
 
        int heightCounter = 1;
        int spaceCounter = height - 1;
        int totalHeight = 1;
 
        while (totalHeight <= height) {
            printSpaces(spaceCounter);
            printStars(heightCounter);
            heightCounter = heightCounter + 2;
            spaceCounter--;
            totalHeight++;
        }
 
        String treeBase = "***";
        int trunkBaseSpace = height - 2;
 
        while (trunkBaseSpace <= height - 2) {
            printSpaces(trunkBaseSpace);
            trunkBaseSpace++;
        }
        System.out.println(treeBase);
 
        int trunkBaseSpace2 = height - 2;
 
        while (trunkBaseSpace2 <= height - 2) {
            printSpaces(trunkBaseSpace2);
            trunkBaseSpace2++;
        }
        System.out.println(treeBase);
        
    }
    
 
    public static void main(String[] args) { 
        printTriangle(5);
        System.out.println("---");
        
        christmasTree(10);
        System.out.println("---");
        
        christmasTree(15);
    }
}
 