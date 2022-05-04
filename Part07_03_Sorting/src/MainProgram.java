 
import java.util.Arrays;
 
public class MainProgram {
 
    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        int[] numbers2 = {12, 1, 4, 2, 15, 9, 11};

        MainProgram.sort(numbers);
        System.out.println();
        MainProgram.sort(numbers2);
    }
    
    public static int smallest(int[] array) {
        int number = array[0];
        int counter = 0;
 
        while (counter < array.length) {
            if (number > array[counter]) {
                number = array[counter];
            } 
            counter++;
        }
        return number;
    }
 
    public static int indexOfSmallest(int[] array) {
        int number = array[0];
        int counter = 0;
        int index = 0;
        int smallestIndex = 0;
 
        while (counter < array.length) {
            if (number > array[counter]) {
                number = array[counter];
                smallestIndex = index;
            } 
            counter++;
            index++;   
        }
        return smallestIndex;
    }
 
    public static void swap(int[] array, int index1, int index2) {
        int holdNumber = 0;
        int counter = 0;
 
        while (counter < array.length) {
            if (counter == index1) {
                holdNumber = array[index2];
                array[index2] = array[index1];
                array[index1] = holdNumber;
            }
            counter++;
        }
    }
 
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int counter = startIndex;
        int number = table[counter];
        int index = startIndex;
        int smallestIndex = startIndex;
 
        while (counter < table.length) {
            if (number > table[counter]) {
                number = table[counter];
                smallestIndex = index;
            } 
            counter++;
            index++;
        }
        return smallestIndex;
    }
 
    public static void sort(int[] array) {
        int counter = 0;
        int smallestIndex = 0;
 
        while (counter < array.length) {
            if (counter == 0) {
                smallestIndex = MainProgram.indexOfSmallest(array);
                MainProgram.swap(array, 0, smallestIndex);
                System.out.println(Arrays.toString(array));
            } else {
                smallestIndex = MainProgram.indexOfSmallestFrom(array, counter);
                MainProgram.swap(array, counter, smallestIndex);
                System.out.println(Arrays.toString(array));
            }
            counter++;
        }
    }
}