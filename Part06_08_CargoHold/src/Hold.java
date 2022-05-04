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
 
public class Hold {
 
    //instance variables
    private int weightMax;
    private int currentWeight = 0;
    private ArrayList<Suitcase> holdList = new ArrayList<>();
 
    //constructor
    public Hold(int weightMax) {
        this.weightMax = weightMax;
    }
 
    //methods
    public void addSuitcase(Suitcase suitcase) {
        if (currentWeight + suitcase.totalWeight() > this.weightMax) {
            System.out.println("Adding this suitcase will exceed Hold weight maximum. Suitcase not added.");
        } else {
            holdList.add(suitcase);
            currentWeight = currentWeight + suitcase.totalWeight();
            System.out.println("Suitcase added to the hold!");
            System.out.println("Current weight is " + currentWeight + " kg.");
        }
    }
 
    public String toString() {
        int counter = 0;
        int itemCounter = 0;
        int weightCounter = 0;
 
        while (counter < holdList.size()) {
            weightCounter = weightCounter + holdList.get(counter).totalWeight();
            itemCounter++;
            counter++;
        }
        return itemCounter + " suitcases (" + weightCounter + " kg)";
    }
 
    public void printItems() {
        int suitcaseCounter = 0;
        Suitcase suitcaseToOpen;
 
        while (suitcaseCounter < holdList.size()) {
            suitcaseToOpen = holdList.get(suitcaseCounter);
            suitcaseToOpen.printItems();
            suitcaseCounter++;
        }
    }
}
 