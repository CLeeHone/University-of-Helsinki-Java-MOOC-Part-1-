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
import java.util.Random;
 
public class JokeManager {
 
    //instance variables
    private ArrayList<String> jokeList;
 
    //parameterless constructor
    public JokeManager() {
        jokeList = new ArrayList<>();
    }
 
    public void addJoke(String joke) {
        jokeList.add(joke);
    }
 
    public String drawJoke() {
        while (true) {
            if (jokeList.isEmpty()) {
                return "Jokes are in short supply.";               
            } else {
            Random draw = new Random();
            int index = draw.nextInt(jokeList.size());
            String joke = jokeList.get(index);
                return joke;
            }
        }
    }
 
    public void printJokes() {
        if (jokeList.isEmpty()) {
            System.out.println("Jokes are in short supply.");
        }
        int counter = 0;
 
        while (counter < jokeList.size()) {
            System.out.println(jokeList.get(counter));
            counter++;
        }
    }
}