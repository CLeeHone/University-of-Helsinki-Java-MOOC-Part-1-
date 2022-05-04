import java.util.ArrayList;
 
public class SimpleCollection {
 
    private String name;
    private ArrayList<String> elements;
 
    public SimpleCollection(String name) {
        this.name = name;
        elements = new ArrayList<>();
    }
 
    public void add(String element) {
        this.elements.add(element);
    }
 
    public ArrayList<String> getElements() {
        return elements;
    }
 
    public String toString() {
        int counter = 1;
        int index = 0;
 
        if (elements.isEmpty()) {
            return "The collection " + name + " is empty.";
        }
 
        while (counter < elements.size()) {
            counter++;
        }
 
        String printOutput = "The collection " + name + " has " + counter + " element:";
        String printOutputMoreThanOne = "The collection " + name + " has " + counter + " elements:";
 
        while (index < elements.size()) {
            if (counter == 1) {
                return printOutput + "\n" + elements.get(index);
            } 
            
            printOutputMoreThanOne = printOutputMoreThanOne + "\n" + elements.get(index);
            index++;
        }
        return printOutputMoreThanOne;
    }
}