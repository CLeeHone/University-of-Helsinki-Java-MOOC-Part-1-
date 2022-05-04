 public class PaymentCard {
 
    private double balance;
 
    public PaymentCard(double balance) {
        this.balance = balance;
    }
 
    public double balance() {
        return balance;
    }
 
    public void addMoney(double increase) {
        balance += increase;
    }
 
    public boolean takeMoney(double amount) {
        // implement the method so that it only takes money from the card if
        // the balance is at least the amount parameter.
        // returns true if successful and false otherwise
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }
}
 