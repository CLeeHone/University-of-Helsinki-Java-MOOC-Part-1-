public class Apartment {
 
    private int rooms;
    private int squares;
    private int pricePerSquare;
 
    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }
 
    public boolean largerThan(Apartment compared) {
        if (squares > compared.squares) {
            return true;
        } else {
            return false;
        }
    }
 
    public int priceDifference(Apartment compared) {
        if (((pricePerSquare * squares) - (compared.pricePerSquare * compared.squares)) < 0) {
            return ((pricePerSquare * squares) - (compared.pricePerSquare * compared.squares)) * -1;
        } else {
            return (pricePerSquare * squares) - (compared.pricePerSquare * compared.squares);
        }
    }
 
    public boolean moreExpensiveThan(Apartment compared) {
        if ((pricePerSquare * squares) > (compared.pricePerSquare * compared.squares)) {
            return true;
        } else {
            return false;
        }
    }
}