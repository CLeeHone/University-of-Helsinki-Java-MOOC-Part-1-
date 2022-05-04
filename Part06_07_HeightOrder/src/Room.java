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
 
public class Room {
 
    //instance variables
    ArrayList<Person> personList;
 
    //parameterless constructor
    public Room() {
        this.personList = new ArrayList<>();
    }
 
    //methods
    public void add(Person person) {
        personList.add(person);
    }
 
    public boolean isEmpty() {
        return personList.isEmpty();
    }
 
    public ArrayList<Person> getPersons() {
        return personList;
    }
 
    public Person shortest() {
        int counter = 0;
        int indexOfShortest = 0;
 
        if (personList.isEmpty()) {
            return null;
        }
        int shortestHeight = personList.get(counter).getHeight();
 
        while (counter < personList.size()) {
            if (shortestHeight >= personList.get(counter).getHeight()) {
                shortestHeight = personList.get(counter).getHeight();
                indexOfShortest = counter;
                counter++;
 
            } else {
                counter++;
            }
        }
        return personList.get(indexOfShortest);
    }
 
    public Person take() {
        if (personList.isEmpty()) {
            return null;
        }
        int counter = 0;
        int indexOfShortest = 0;
 
        if (personList.isEmpty()) {
            return null;
        }
        int shortestHeight = personList.get(counter).getHeight();
 
        while (counter < personList.size()) {
            if (shortestHeight >= personList.get(counter).getHeight()) {
                shortestHeight = personList.get(counter).getHeight();
                indexOfShortest = counter;
                counter++;
 
            } else {
                counter++;
            }
        }
        return personList.remove(indexOfShortest);
    }
}