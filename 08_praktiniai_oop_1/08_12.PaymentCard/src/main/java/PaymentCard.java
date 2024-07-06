public class PaymentCard {

    private double balance;


    public PaymentCard(double openingBalance){
        this.balance = openingBalance;
    }

    public void eatAffordably(){
        double affordable = 2.60;
        if (affordable <= balance) balance -= affordable;
    }

    public void eatHeartily(){
        double expensive = 4.60;
        if (expensive <= balance) balance -= expensive;
    }

    public void addMoney(double amount){
        if (amount > 0) balance += amount;
        if ((balance + amount) >= 150) balance = 150.00;
    }


//    public String toString(){
//        return String.format("The card has a balance of %.2f euros", balance);
//    }

    public String toString(){
        return "The card has a balance of " + balance + " euros";
    }
}
