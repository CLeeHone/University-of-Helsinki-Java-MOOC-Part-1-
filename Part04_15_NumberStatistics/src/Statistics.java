public class Statistics {
    //instance variables
    private int count;
    private int sum;
    
    //constructor
    public Statistics() {
        this.count = 0;
        this.sum = 0;
    }
    
    //methods
    public void addNumber(int number) {
        count = count + 1;
        sum = sum + number;
    }
    
    public int getCount() {
        return count;
    }
    
    public int sum() {
        return sum;
    }
    
    public double average() {
        if (this.count == 0) {
            return 0;
        } else {
        return (1.0 * sum/count);
        }
    }
}
 