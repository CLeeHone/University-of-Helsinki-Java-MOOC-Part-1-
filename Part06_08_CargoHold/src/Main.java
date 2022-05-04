public class Main {
 
    public static void main(String[] args) {
        // You can use the main to test your classes!
        Item book = new Item("Lord of the Rings", 2);
        Item phone = new Item("Nokia 3210", 1);
        Item laptop = new Item("Laptop", 4);
 
        Suitcase joeCase = new Suitcase(10);
        joeCase.addItem(book);
        joeCase.addItem(phone);
 
        Suitcase adaCase = new Suitcase(10);
        adaCase.addItem(laptop);
 
        Hold hold = new Hold(1000);
        hold.addSuitcase(joeCase);
        hold.addSuitcase(adaCase);
 
        System.out.println("\nThe suitcases in the hold contain the following items:");
        hold.printItems();
    }
}