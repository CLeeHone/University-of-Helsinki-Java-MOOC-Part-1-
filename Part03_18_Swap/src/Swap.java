import java.util.Scanner;
 
public class Swap {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 3;
        array[2] = 5;
        array[3] = 7;
        array[4] = 9;
 
        int index = 0;
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }
 
        // Implement here
        // asking for the two indices
        // and then swapping them
        System.out.println("\nGive two indices to swap:");
        int indiceSwap1 = Integer.valueOf(scanner.nextLine());
        int indiceSwap2 = Integer.valueOf(scanner.nextLine());
 
        System.out.println("");
        index = 0;
        while (index < array.length) {
            if (index == indiceSwap2) {
                System.out.println(array[index]);
                index++;
            }
            if (index == indiceSwap1) {
                int helper = array[indiceSwap1];
                array[indiceSwap1] = array[indiceSwap2];
                array[indiceSwap2] = helper;
            }
            if (index + 1 <= array.length) {
                System.out.println(array[index]);
                index++;
            }
        }
    }
}