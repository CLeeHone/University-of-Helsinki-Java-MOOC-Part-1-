public class PrintInStars {
 
    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }
 
    public static void printArrayInStars(int[] array) {
        int index = 0; 
        String star = "*";
 
        while (index < array.length) {
            int starIndex = 0;
            int number = array[index];
 
            while (starIndex < number) {
                System.out.print(star);
                starIndex++;
            }
            System.out.println("");
            index++;
        }
    }
}