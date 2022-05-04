/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author chloe
 */
public class Container {
 
    //instance variables
    int amount = 0;
 
    //parameterless constructor
    public Container() {
    }
 
    //methods
    public int contains() {
        return amount;
    }
 
    public void add(int amount) {
        if (amount < 0) {
            System.out.println("Cannot add a negative amount.");
        } else if (this.amount + amount <= 100) {
            this.amount += amount;
        } else {
            this.amount = 100;
        }
    }
 
    public void remove(int amount) {
        if (amount < 0) {
            System.out.println("Cannot remove a negative amount.");
        } else if (this.amount - amount < 0) {
            this.amount = 0;
        } else {
            this.amount -= amount;
        }
    }
 
    public String toString() {
        return this.amount + "/100";
    }
}