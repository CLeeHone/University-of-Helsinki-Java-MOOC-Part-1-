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
 
public class Package {
    //instance variable
    private ArrayList<Gift> giftList;
    
    //parameterless constructor
    public Package() {
        giftList = new ArrayList<>();
    }
    
    //methods
    public void addGift(Gift gift) {
        giftList.add(gift);
    }
    
    public double totalWeight() {
        int counter = 0;
        double sumWeight = 0;
        
        while (counter < giftList.size()) {
            sumWeight = sumWeight + giftList.get(counter).getWeight();
            counter++;
        }
        return sumWeight;
    }
}
 