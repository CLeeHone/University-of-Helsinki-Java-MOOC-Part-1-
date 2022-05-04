/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author chloe
 */
public class Fitbyte {
    //instance variables
    private int age;
    private int restingHeartRate;
    
    //constructor
    public Fitbyte(int age, int restingHeartRate) {
        this.age = age;
        this.restingHeartRate = restingHeartRate;
    }
    
    //methods
    public double maximumHeartRate() {
        return 206.3 - (0.711 * age);
    }
    
    public double targetHeartRate(double percentageOfMaximum) {
        return (maximumHeartRate() - restingHeartRate) * percentageOfMaximum + restingHeartRate;
    }  
}