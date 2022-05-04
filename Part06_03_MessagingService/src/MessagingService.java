/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author chloe
 */
import java.util.ArrayList;
 
public class MessagingService {
    //instance variable
    ArrayList<Message> messageList;
    
    //constructor
    public MessagingService() {
        this.messageList = new ArrayList<>();
    }
    
    public void add(Message message) {
        String content = String.valueOf(message.getContent());
        if (content.length() <= 280) {
            messageList.add(message);
            System.out.println("Message added!");
        } else {
            System.out.println("Message too long, not added!");
        }
    }
    
    public ArrayList<Message> getMessages() {
        return messageList;
    }
}