/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author chloe
 */
public class Cube {
    //instance variable 
    private int edgeLength;
    
    //constructor
    public Cube(int edgeLength) {
        this.edgeLength = edgeLength;
    }
    //methods
    public int volume() {
        return edgeLength * edgeLength * edgeLength;
    }
    
    public String toString() {
        return "The length of the edge is " + edgeLength + " and the volume " + volume();
    }
    
}