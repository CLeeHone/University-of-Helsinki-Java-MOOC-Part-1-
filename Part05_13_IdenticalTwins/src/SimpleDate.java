public class SimpleDate {
 
    private int day;
    private int month;
    private int year;
 
    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
 
    public int getDay() {
        return day;
    }
 
    public int getMonth() {
        return month;
    }
 
    public int getYear() {
        return year;
    }
 
    public boolean equals(Object compared) {
        // if the variables are located in the same place, they are the same.
        if (this == compared) {
            return true;
        }
 
        // if the object is not instance of SimpleDate, the objects are not the same
        if (!(compared instanceof SimpleDate)) {
            return false;
        }
 
        // let's cast the object to SimpleDate
        SimpleDate otherDate = (SimpleDate) compared;
 
        // if the object's values are the same, the objects are the same
        if (day == otherDate.day
                && month == otherDate.month
                && year == otherDate.year) {
            return true;
        }
 
        // other wise, the objects are not the same
        return false;
    }
 
    @Override
    public String toString() {
        return day + "." + month + "." + year;
    }
}