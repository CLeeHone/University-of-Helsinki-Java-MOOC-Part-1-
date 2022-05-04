 public class Main {
 
    public static void main(String[] args) {
        Gift book = new Gift("The Gone-Away World", 0.5);
 
        Package gifts = new Package();
        gifts.addGift(book);
        
        System.out.println("The gifts' total weight is: " + gifts.totalWeight() + "kg");
    }
}