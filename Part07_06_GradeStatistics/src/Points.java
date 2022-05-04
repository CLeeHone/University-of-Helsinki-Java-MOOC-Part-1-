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
 
public class Points {
 
    //instance variables
    ArrayList<Integer> gradeList = new ArrayList<>();
    ArrayList<Integer> convertedGradeList = new ArrayList<>();
 
    //constructor
    public Points() {
        gradeList = new ArrayList<>();
        convertedGradeList = new ArrayList<>();
    }
 
    //methods
    public void add(int grade) {
        if (grade >= 0 && grade <= 100) {
            gradeList.add(grade);
        } else {
            System.out.println("Erroneous imput. The grade you tried to add is either negative (< 0) or greater than 100 (> 100), and was therefore not added to the list.");
        }
    }
 
    public double average() {
        int counter = 0;
        int sum = 0;
 
        while (counter < gradeList.size()) {
            sum = sum + gradeList.get(counter);
            counter++;
        }
        return 1.0 * sum / counter;
    }
 
    public double averagePassing() {
        int counter = 0;
        int numberOfPassing = 0;
        int sum = 0;
 
        while (counter < gradeList.size()) {
            if (gradeList.get(counter) >= 50) {
                sum += gradeList.get(counter);
                numberOfPassing++;
                counter++;
            } else {
                counter++;
            }
        }
        if (numberOfPassing > 0) {
            return 1.0 * sum / numberOfPassing;
        } else {
            return -1;
        }
    }
 
    public double passPercentage() {
        int passingParticipants = 0;
        int allParticipants = 0;
 
        for (int i = 0; i < gradeList.size(); i++) {
            if (gradeList.get(i) >= 50) {
                passingParticipants++;
                allParticipants++;
            } else {
                allParticipants++;
            }
        }
        if (passingParticipants > 0) {
            return 1.0 * 100 * passingParticipants / allParticipants;
        } else {
            return -1;
        }
    }
 
    public ArrayList<Integer> convert() {
        int counter = 0;
        
        while (counter < gradeList.size()) {
            
            if (gradeList.get(counter) >= 0 && gradeList.get(counter) < 50) {
                convertedGradeList.add(0);
                counter++;
            } else if (gradeList.get(counter) < 60) {
                convertedGradeList.add(1);
                counter++;
            } else if (gradeList.get(counter) < 70) {
                convertedGradeList.add(2);
                counter++;
            } else if (gradeList.get(counter) < 80) {
                convertedGradeList.add(3);
                counter++;
            } else if (gradeList.get(counter) < 90) {
                convertedGradeList.add(4);
                counter++;
            } else if (gradeList.get(counter) <= 100) {
                convertedGradeList.add(5);
                counter++;
            } else {
                System.out.println("Not a valid number");
            }
        }
        return convertedGradeList;
    }
    
    public String printStars(int starCount) {
        int counter = 0;
        String numberOfStars = "";
        
        while (counter < convertedGradeList.size()) {
            if (convertedGradeList.get(counter) == starCount) {
               numberOfStars = numberOfStars + "*";
               counter++;
            } else {
                counter++;
            }
        }
        return numberOfStars;
    }
}