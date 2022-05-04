/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author chloe
 */
public class Book {
    //instance variables
    private String title;
    private int pages;
    private int year;
    
    //constructor
    public Book(String title, int pages, int year) {
        this.title = title;
        this.pages = pages;
        this.year = year;
    }
    
    //methods
    public String getTitle(){
        return title;
    }
    
    public int getPages(){
        return pages;
    }
    
    public int getYear(){
        return year;
    }   
}
 