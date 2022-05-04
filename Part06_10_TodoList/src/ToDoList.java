/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author chloe
 */
import java.util.ArrayList;
 
public class ToDoList {
    private ArrayList<String> list = new ArrayList<>();
    
    //parameterless constructor
    public ToDoList() {
    }
    
    //methods
    public void add(String task) {
        list.add(task);
    }
    
    public void print() {
        int index = 0;
        while (index < list.size()) {
            System.out.println((index + 1) + ": " + list.get(index));
            index++;
        }
    }
    
    public void remove(int number) {
        list.remove(number - 1);
    }
    
}