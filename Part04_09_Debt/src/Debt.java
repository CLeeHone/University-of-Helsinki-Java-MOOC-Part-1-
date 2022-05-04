/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author chloe
 */
public class Debt {
    //instance variables
    private double balance = 0;
    private double interestRate = 0;
    
    //constructor
    public Debt (double initialBalance, double initialInterestRate) {
        this.balance = initialBalance;
        this.interestRate = initialInterestRate;
    }
    
    //methods
    public void printBalance(){
        System.out.println(this.balance);
    }
    public void waitOneYear() {
        balance = this.balance * this.interestRate;
    }
}