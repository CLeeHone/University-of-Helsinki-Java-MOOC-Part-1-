public class YourFirstAccount {
 
    public static void main(String[] args) {
        Account myAccount = new Account ("My account", 100.00);
        
        myAccount.deposit(20.00);
        
        System.out.println("The balance of this account it: " + myAccount);
    }
}