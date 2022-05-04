public class Main {
 
    public static void main(String[] args) {
        // you can write code here for testing your program
 
        Song concerto = new Song("Piano Concerto No. 21", "Mozart", 433);
        Song anotherConcerto = new Song("Piano Concerto No. 21", "Mozart", 433);
 
        if (concerto.equals(anotherConcerto)) {
            System.out.println("Songs are equal.");
        }
 
        if (concerto.equals("Another object")) {
            System.out.println("Strange things are afoot.");
        }
    }
}