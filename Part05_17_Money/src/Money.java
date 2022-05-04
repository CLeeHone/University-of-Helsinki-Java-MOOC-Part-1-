public class Money {
 
    private final int euros;
    private final int cents;
 
    public Money(int euros, int cents) {
 
        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }
 
        this.euros = euros;
        this.cents = cents;
    }
 
    public int euros() {
        return euros;
    }
 
    public int cents() {
        return cents;
    }
 
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }
        return euros + "." + zero + cents + "e";
    }
 
    public Money plus(Money addition) {
        Money newestMoney = new Money(this.euros + addition.euros, this.cents + addition.cents);
        return newestMoney;
    }
 
    public boolean lessThan(Money compared) {
        if (this.euros < compared.euros) {
            return true;
        }
        if (this.euros == compared.euros && this.cents < compared.cents) {
            return true;
        } else {
            return false;
        }
    }
 
    public Money minus(Money decreaser) {
        Money firstDecrease = new Money(this.euros - decreaser.euros, this.cents - decreaser.cents);
 
        if (firstDecrease.euros < 0) {
            Money zeroMoney = new Money(0, 0);
            return zeroMoney;
            
        } else if (this.cents < decreaser.cents) { //ex. 0.5 - 0.75
                int centsCounter = decreaser.cents - this.cents;
                int remainingCents = 100 - centsCounter;
                int remainingEuros = this.euros - decreaser.euros - 1;
                Money secondDecrease = new Money(remainingEuros, remainingCents);
                return secondDecrease;
            } else {
                return firstDecrease;
        }
    }
}
 