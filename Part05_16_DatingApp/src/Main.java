public class Main {
 
    public static void main(String[] args) {
        // test your program here!
        SimpleDate date = new SimpleDate(13, 2, 2015);
        System.out.println("Friday of the examined week is " + date);
 
        SimpleDate newDate = date.afterNumberOfDays(7);
        int week = 1;
        while (week <= 8) {
            System.out.println("Friday after " + week + " weeks is " + newDate);
            newDate = newDate.afterNumberOfDays(10);
 
            week = week + 1;
        }
 
        System.out.println("The date after 790 days from the examined Friday is ... try it out yourself!");
            System.out.println("Try " + date.afterNumberOfDays(790));
            
        SimpleDate date1 = new SimpleDate(20, 01, 2018);
        SimpleDate date2 = new SimpleDate(18, 01, 2018);
        SimpleDate date3 = new SimpleDate(05, 02, 2018);
        SimpleDate date4 = new SimpleDate(05, 02, 2016);


        System.out.println(date1.before(date2)); // false
        System.out.println(date2.before(date1)); // true
        System.out.println(date3.before(date4)); // false
        System.out.println(date4.before(date3)); // true
    }
}