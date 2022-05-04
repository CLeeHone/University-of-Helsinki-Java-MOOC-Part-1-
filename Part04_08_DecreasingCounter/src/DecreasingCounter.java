public class DecreasingCounter {
	// an object variable for storing the value of the counter
    private int value;  
 
    public DecreasingCounter(int initialValue) {
        this.value = initialValue;
    }
 
    public void printValue() {
        // Do not change this code!
        System.out.println("value: " + this.value);
    }
 
    public void decrement() {
        // write the method implementation here
        // the aim is to decrement the value of the counter by one
        if (this.value > 0) {
            this.value = this.value - 1;
        }
    }
    // the other methods go here
    public void reset() {
        if (this.value > 0) {
            this.value = 0;
        }
    }
}