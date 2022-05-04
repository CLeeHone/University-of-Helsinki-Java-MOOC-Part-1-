public class Main {
 
    public static void main(String[] args) {
 
        // Try out your class here
        Message talk = new Message("Sender", "Hi there!");
        Message talk2 = new Message("Joe", "Hello, how are you?");
        
        MessagingService list = new MessagingService();
        
        list.add(talk);
        list.add(talk2);
        
        list.getMessages();
        
        System.out.println(list.getMessages());
    }
}