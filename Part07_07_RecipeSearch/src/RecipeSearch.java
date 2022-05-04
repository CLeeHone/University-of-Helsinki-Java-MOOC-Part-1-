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
import java.util.Scanner;
import java.nio.file.Paths;
 
public class RecipeSearch {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.println("File to read:");
        String fileToRead = scanner.nextLine();
 
        while (true) {
            try ( Scanner recipes = new Scanner(Paths.get(fileToRead))) {
 
                System.out.println("Commands:");
                System.out.println("list - lists the recipes");
                System.out.println("stop - stops the program");
                System.out.println("find name - searches recipes by name");
                System.out.println("find cooking time - searches recipes by cooking time");
                System.out.println("find ingredient - searches recipes by ingredient\n");
                System.out.println("Enter command:");
 
                String command = scanner.nextLine();
 
                if (command.equals("stop")) {
                    break;
                }
                if (command.equals("find name")) {
                    System.out.println("Searched word:");
                    String word = scanner.nextLine();
 
                    ArrayList<String> recipeRows = new ArrayList<>();
 
                    while (recipes.hasNextLine()) {
                        recipeRows.add(recipes.nextLine());
                    }
 
                    for (int i = 0; i < recipeRows.size(); i++) {
                        if (recipeRows.get(i).contains(word)) {
                            String recipeName = recipeRows.get(i);
                            int recipeTime = Integer.valueOf(recipeRows.get(i + 1));
                            System.out.println(recipeName + ", cooking time: " + recipeTime);
                        }
                    }
                }
 
                if (command.equals("find cooking time")) {
                    System.out.println("Max cooking time:");
                    int time = Integer.valueOf(scanner.nextLine());
 
                    ArrayList<String> recipeRows = new ArrayList<>();
 
                    while (recipes.hasNextLine()) {
                        recipeRows.add(recipes.nextLine());
                    }
 
                    for (int i = 0; i < recipeRows.size(); i++) {
                        String recipeName;
                        int recipeTime;
 
                        if (i == 0) {
                            recipeName = recipeRows.get(i);
                            recipeTime = Integer.valueOf(recipeRows.get(i + 1));
                            if (recipeTime <= time) {
                                System.out.println(recipeName + ", cooking time: " + recipeTime);
                            }
                        }
 
                        if (recipeRows.get(i).isEmpty()) {
                            recipeName = recipeRows.get(i + 1);
                            recipeTime = Integer.valueOf(recipeRows.get(i + 2));
 
                            if (recipeTime <= time) {
                                System.out.println(recipeName + ", cooking time: " + recipeTime);
                            }
                        }
                    }
                }
 
                if (command.equals("find ingredient")) {
                    System.out.println("ingredient:");
                    String ingredient = scanner.nextLine();
 
                    ArrayList<String> allRecipesList = new ArrayList<>();
                    ArrayList<String> recipeRows = new ArrayList<>();
 
                    while (recipes.hasNextLine()) {
                        recipeRows.add(recipes.nextLine());
                    }
                    recipeRows.add("");
 
                    for (int i = 0; i < recipeRows.size(); i++) {
 
                        if (recipeRows.get(i).isEmpty()) {
 
                            for (int j = 0; j < allRecipesList.size(); j++) {
                                if (allRecipesList.get(j).contentEquals(ingredient)) {
                                    System.out.println(allRecipesList.get(0) + ", cooking time: " + allRecipesList.get(1));
                                }
                            }
                            allRecipesList.clear();
 
                        } else {
                            allRecipesList.add(recipeRows.get(i));
                        }
                    }
                }
 
                if (command.equals("list")) {
                    System.out.println("Recipes:");
 
                    ArrayList<String> recipeRows = new ArrayList<>();
                    String recipeName;
                    int recipeTime;
 
                    while (recipes.hasNextLine()) {
                        recipeRows.add(recipes.nextLine());
                    }
 
                    for (int i = 0; i < recipeRows.size(); i++) {
                        if (i == 0) {
                            recipeName = recipeRows.get(i);
                            recipeTime = Integer.valueOf(recipeRows.get(i + 1));
                            System.out.println(recipeName + ", cooking time: " + recipeTime);
                        }
                        if (recipeRows.get(i).isEmpty()) {
                            recipeName = recipeRows.get(i + 1);
                            recipeTime = Integer.valueOf(recipeRows.get(i + 2));
                            System.out.println(recipeName + ", cooking time: " + recipeTime);
                        }
                    }
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                break;
            }
        }
    }
}