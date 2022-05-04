public class Main {
 
    public static void main(String[] args) {
        Room room = new Room();
 
        room.shortest();
 
        Person first = new Person("first", 160);
        Person second = new Person("second", 145);
        Person third = new Person("third", 158);
 
        room.add(second);
        room.add(first);
        room.add(third);
 
        System.out.println(room.shortest());
    }
}