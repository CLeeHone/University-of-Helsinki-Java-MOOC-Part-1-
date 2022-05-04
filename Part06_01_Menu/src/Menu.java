import java.util.ArrayList;
 
public class Menu {
 
    private ArrayList<String> meals;
 
    public Menu() {
        meals = new ArrayList<>();
    }
 
    public void addMeal(String meal) {
        if (meals.contains(meal)) {
            System.out.println("That meal has already been added to the menu, so it was not added.");
        } else {
            meals.add(meal);
        }
    }
 
    public void printMeals() {
        int counter = 0;
        while (counter < meals.size()) {
            System.out.println(meals.get(counter));
            counter++;
        }
    }
    
    public void clearMenu() {
        meals.clear();
    }
 
}