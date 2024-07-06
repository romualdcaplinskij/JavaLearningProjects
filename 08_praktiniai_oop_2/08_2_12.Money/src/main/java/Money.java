
public class Money {

    private int euros;
    private int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public Money plus(Money addition) {
        Money newMoney = new Money(this.euros, this.cents);
        newMoney.euros += addition.euros;
        newMoney.cents += addition.cents;
        if (newMoney.cents > 99) {
            newMoney.euros = newMoney.euros + newMoney.cents / 100;
            newMoney.cents = newMoney.cents % 100;
        }
        return newMoney;
    }

    public boolean lessThan(Money compared) {
        if (compared.euros >= 0)
            return (this.euros*100 + this.cents) < (compared.euros*100 + compared.cents);
        return false;
    }

//    public Money minus(Money decreaser){
//        Money newMoney = new Money(this.euros, this.cents);
//        newMoney.euros -= decreaser.euros;
//
//        if (newMoney.euros < 0){
//            newMoney.cents += newMoney.euros * 100;
//            newMoney.euros = 0;
//        }
//
//        newMoney.cents -= decreaser.cents;
//        if (newMoney.cents < 0){
//            newMoney.cents += 100;
//            newMoney.euros--;
//        }
//
//        if (newMoney.euros < 0) {
//            newMoney.euros = 0;
//        }
//        if (newMoney.cents < 0) {
//            newMoney.cents = 0;
//        }
//        return newMoney;
//    }

    public Money minus(Money decreaser){
        Money newMoney = new Money(this.euros, this.cents);

        return newMoney;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
