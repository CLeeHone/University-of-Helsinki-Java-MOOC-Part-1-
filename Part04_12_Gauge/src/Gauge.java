/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author chloe
 */
public class Gauge {
    //instance variable
    private int value = 0;
    
    //constructor
    public Gauge(){   
    }
    
    //methods
    public void increase() {
        if (value < 5) {
            value = value + 1;
        }
    }
    
    public void decrease() {
        if (value > 0) {
            value = value - 1;
        }
    }
    
    public int value() {
        return(value);
    }
    
    public boolean full() {
        return value == 5;
    }
}
 