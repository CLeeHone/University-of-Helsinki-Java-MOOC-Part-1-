 
import java.util.ArrayList;
 
public class SimpleCollection {
 
    private String name;
    private ArrayList<String> elements;
 
    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }
 
    public void add(String element) {
        this.elements.add(element);
    }
 
    public ArrayList<String> getElements() {
        return elements;
    }
    
    public String longest() {
        int counter = 0;
        
        if (elements.isEmpty()) {
            return null;
        }
        
        String returnObject = elements.get(0);
 
        while (counter < elements.size()) {
            if (returnObject.length() < elements.get(counter).length()) {
                returnObject = elements.get(counter);
                counter++;
            } else {
                counter ++;
            }
        }
        return returnObject;
    }
}