/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author chloe
 */
public class Gift {
    //instance variables
    private String name;
    private double weight;
    
    //constructor
    public Gift (String name, double weight) {
        this.name = name;
        this.weight = weight;
    }
    
    //methods
    public String getName() {
        return name;
    }
    
    public double getWeight() {
        return weight;
    }
    
    public String toString() {
        return name + " (" + weight + " kg)";
    }
    
}