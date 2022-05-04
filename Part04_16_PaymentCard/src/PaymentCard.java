/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author chloe
 */
public class PaymentCard {
 
    //instance variable
    private double balance;
 
    //constructor
    public PaymentCard(double balanceStart) {
        this.balance = balanceStart;
    }
 
    //methods
    public String toString() {
        return "The card has a balance of " + balance + " euros";
    }
 
    public void eatAffordably() {
        if (balance - 2.60 >= 0) {
            balance = balance - 2.60;
        }
    }
 
    public void eatHeartily() {
        if (balance - 4.60 >= 0) {
            balance = balance - 4.60;
        }
    }
 
    public void addMoney(double amount) {
        if (amount < 0) {
            balance = balance;
        } else if (amount > 0 && amount + balance <= 150) {
            balance = balance + amount;
        } else {
            balance = 150;
        }
    }
}