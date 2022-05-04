public class Main {
 
    public static void main(String[] args) {
        // write experimental code here to check how your program functions
        Person joe = new Person("Joe", 27, 168, 150);
        HealthStation healthStation = new HealthStation();
        
        System.out.println(joe.getName() + "'s weight is " + joe.getWeight() + " pounds");
        
        healthStation.feed(joe);
        System.out.println(joe.getName() + "'s weight is " + joe.getWeight() + " pounds");
        
        System.out.println("Weighings performed: " + healthStation.weighings());
    }
}