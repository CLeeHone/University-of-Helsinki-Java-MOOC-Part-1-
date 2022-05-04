public class PrintNeatly {
 
    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }
 
    public static void printNeatly(int[] array) {
        int index = 0;
        
        while (index < array.length) {
            int number = array[index];
                    
            if (index == array.length-1) {
                System.out.println(number);
                break;
            }
            System.out.print(number + ", ");
            index ++;
        }
    }
}