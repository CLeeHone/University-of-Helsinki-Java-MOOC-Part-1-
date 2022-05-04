public class SimpleDate {
 
    private int day;
    private int month;
    private int year;
 
    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
 
    @Override
    public String toString() {
        return day + "." + month + "." + year;
    }
 
    public boolean before(SimpleDate compared) {
        if (year < compared.year) {
            return true;
        }
 
        if (year == compared.year && month < compared.month) {
            return true;
        }
 
        if (year == compared.year && month == compared.month
                && this.day < compared.day) {
            return true;
        }
 
        return false;
    }
 
    public void advance() {
        if (day + 1 > 30) {
            day = 1;
            if (month == 12) {
                month = 1;
                year++;
            } else {
                month++;
            }
        } else {
            day++;
        }
    }
 
    public void advance(int howManyDays) {
        int advanceCounter;
 
        if (day + howManyDays > 30) {
            advanceCounter = (30 - day);
            advanceCounter = howManyDays - advanceCounter;
            this.day = advanceCounter;
            if (month == 12) {
                month = 1;
                year++;
            } else {
                month++;
            }
        }
    }
 
    public SimpleDate afterNumberOfDays(int days) {
        SimpleDate newDate = new SimpleDate(this.day, this.month, this.year);
        int Counter2 = 0; // variable that allows us to calculate how many days into the new month the new day is
        int numberOfDaysLeft = days; // variable that determines wether we have accounted for all the new days added to the original date
 
        if (newDate.day + days <= 30) {
            newDate.day = newDate.day + days;
        } else {
            while (numberOfDaysLeft > 0) {
 
                Counter2 = (30 - newDate.day); // we calculate the difference before the month is over
                numberOfDaysLeft = numberOfDaysLeft - Counter2; // substract the days from the day count down variable
                Counter2 = days - Counter2; // difference after the month is over
                numberOfDaysLeft = numberOfDaysLeft - Counter2;
                newDate.day = Counter2;
 
                if (newDate.month == 12) {
                    newDate.month = 1;
                    newDate.year = newDate.year + 1;
                } else {
                    newDate.month++;
                }
            }
        }
        return newDate;
    }
}