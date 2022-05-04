/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author chloe
 */
public class Exercise {
    //instance variables
    private String name;
    private boolean completed;
    
    //constructor
    public  Exercise(String name) {
        this.name = name;
        this.completed = false;
    } 
    
    public String getName() {
        return name;
    }
    
    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
    
    public boolean isCompleted() {
        return completed;
    }
}