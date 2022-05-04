/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author chloe
 */
public class Product {
    //Create the instance variables
    private String name = "banana";
    private double price = 1.1;
    private int quantity = 13;
 
    //create the constructor
    public Product (String initialName, double initialPrice, int initialQuantity) {
        this.name = initialName;
        this.price = initialPrice;
        this.quantity = initialQuantity;
    }
    //Create the method
    public void printProduct() {
        System.out.println(name + ", price " + price + ", " + quantity + " pcs");
    } 
}
 