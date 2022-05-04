public class Main {
 
    public static void main(String[] args) {
        // you can write code here to try out your program
        SimpleDate date = new SimpleDate(24, 3, 2017);
        SimpleDate date2 = new SimpleDate(23, 7, 2017);
 
        Person leo = new Person("Leo", date, 62, 9);
        Person lily = new Person("Lily", date2, 65, 8);
 
        if (leo.equals(lily)) {
            System.out.println("Is this quite correct?");
        } else {
            System.out.println("Leo does not equal Lily");
        }
        
        Person leoWithDifferentWeight = new Person("Leo", date, 62, 10);
 
        if (leo.equals(leoWithDifferentWeight)) {
            System.out.println("Is this quite correct?");
        } else {
            System.out.println("Leo with a different weight does not equal Leo's original parameters");
        }
        //Change Lily's parameters to check if the equals method works
        Person lilyWithEverythingChanged = new Person("Leo", date, 62, 10);
        
        if (lilyWithEverythingChanged.equals(leoWithDifferentWeight)) {
            System.out.println("Lily has the exact same parameters as Leo");
        } else {
            System.out.println("Lily doesn't have the exact same parameters, this isn't right");
        }
    }
}