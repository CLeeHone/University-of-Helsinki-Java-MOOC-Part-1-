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
    private String author;
    private String title;
    private int pageCount;
    
    //constructor
    public Book(String author, String title, int pageCount) {
        this.author = author;
        this.title = title;
        this.pageCount = pageCount;
    }
    
    //methods
    public String getAuthor() {
        return author;
    }
    
    public String getName() {
        return title;
    }
    
    public int getPages() {
        return pageCount;
    }
    
    public String toString() {
        return author + ", " + title + ", " + pageCount + " pages";
    }
}