/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author chloe
 */
import java.util.Scanner;
 
public class UserInterface {
 
    //instance variable
    Points gradeList = new Points();
    Points convertedList = new Points();
 
    //constructor
    public UserInterface() {
    }
 
    //method
    public void Start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter point totals, -1 stops");
        while (true) {
            String numberString = scanner.nextLine();
            if (numberString.equals("-1")) {
                break;
            } else {
                int grade = Integer.valueOf(numberString);
                gradeList.add(grade);
                convertedList.convert();
            }
        }
        System.out.println("Point average (all): " + gradeList.average());
        if (gradeList.passPercentage() == -1) {
            System.out.println("Point average (passing):" + "-");
        } else {
            System.out.println("Point average passing:" + gradeList.averagePassing());
            System.out.println("Pass percentage:" + gradeList.passPercentage());
        }
        System.out.println(gradeList.convert());
 
        System.out.println("Grade distribution:");
        System.out.println("5:" + gradeList.printStars(5));
        System.out.println("4:" + gradeList.printStars(4));
        System.out.println("3:" + gradeList.printStars(3));
        System.out.println("2:" + gradeList.printStars(2));
        System.out.println("1:" + gradeList.printStars(1));
        System.out.println("0:" + gradeList.printStars(0));
    }
}