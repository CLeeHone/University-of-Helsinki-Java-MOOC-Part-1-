/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author chloe
 */
public class Counter {
    //instance variable
    private int counter = 0;
 
    //constructors
    public Counter() {
    }
 
    public Counter(int startValue) {
        counter = startValue;
    }
 
    //methods
    public int value() {
        return counter;
    }
 
    public void increase() {
        counter++;
    }
 
    public void decrease() {
        counter--;
    }
 
    public void increase(int increaseBy) {
        if (increaseBy >= 0) {
            counter += increaseBy;
        }
    }
 
    public void decrease(int decreaseBy) {
        if (decreaseBy >= 0) {
        	counter -= decreaseBy;
        }
    }
    
    public String toString() {
        return String.valueOf(counter);
    }
}