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
 
public class Suitcase {
 
    //instance variables??
    private int max;
    private ArrayList<Item> itemList = new ArrayList<>();
 
    //constructor
    public Suitcase(int maximum) {
        this.max = maximum;
    }
 
    //methods
    public void addItem(Item item) {
        //create a loop to determine total current weight of suitcase
        //then compare that total with this.max
        int counter = 0;
        int weightTotal = 0;
 
        while (counter < itemList.size()) {
            weightTotal = weightTotal + itemList.get(counter).getWeight();
            counter++;
        }
        if (weightTotal + item.getWeight() <= this.max) {
            itemList.add(item);
        }
    }
 
    public String toString() {
        int itemCount = 0;
        int weightSum = 0;
        if (itemList.isEmpty()) {
            return "no items (0 kg)";
        }
 
        while (itemCount < itemList.size()) {
            weightSum = weightSum + itemList.get(itemCount).getWeight();
            itemCount++;
        }
        if (itemCount > 1) {
            return itemCount + " items (" + weightSum + " kg)";
        } else {
            return itemCount + " item (" + weightSum + " kg)";
        }
    }
 
    public void printItems() {
        int counter = 0; 
        while (counter < itemList.size()) {
            System.out.println(itemList.get(counter));
            counter++;
        }
    }
 
    public int totalWeight() {
        int weightCounter = 0;
        int weightSum = 0;
 
        while (weightCounter < itemList.size()) {
            weightSum = weightSum + itemList.get(weightCounter).getWeight();
            weightCounter++;
        }
        return weightSum;
    }
 
    public Item heaviestItem() {
        if (itemList.isEmpty()) {
            return null;
        }
        
        int itemCounter = 0;
        int heaviestItem = itemList.get(0).getWeight();
        int objectReturnIndex = 0;
 
        while (itemCounter < itemList.size()) {
            if (heaviestItem < itemList.get(itemCounter).getWeight()) {
                heaviestItem = itemList.get(itemCounter).getWeight();
                objectReturnIndex++;
 
                itemCounter++;
            } else {
                itemCounter++;
            }
        }
        return itemList.get(objectReturnIndex);
    }
}