/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author chloe
 */
public class Timer {
 
    //instance variables
    private ClockHand seconds;
    private ClockHand hundredths;
 
    //constructor
    public Timer() {
        seconds = new ClockHand(60);
        hundredths = new ClockHand(100);
    }
 
    //methods
    public String toString() {
        return seconds + ":" + hundredths;
    }
 
    public void advance() {
        hundredths.advance();
        if (hundredths.value() == 00) {
            seconds.advance();
        }
        if (seconds.value() == 60) {
            seconds.advance();
        }
    }
}
 