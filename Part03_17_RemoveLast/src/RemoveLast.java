import java.util.ArrayList;
 
public class RemoveLast {
 
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Hello, ");
        strings.add("this course is ");
        strings.add("great ");
        
        System.out.println(strings);
        removeLast(strings);
        System.out.println(strings);
    }
    
    public static void removeLast(ArrayList<String> strings) {
        if (strings.isEmpty()) {
            return;
        }
        strings.remove(strings.size() - 1);
    }
}