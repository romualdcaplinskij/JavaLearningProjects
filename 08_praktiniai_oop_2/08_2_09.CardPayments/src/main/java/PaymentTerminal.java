
public class PaymentTerminal {


    private double money;  // amount of cash

    private double change; // remaining change
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals

    private static final double AFFORDABLE_PRICE = 2.5;
    private static final double HEARTILY_PRICE = 4.3;


    public PaymentTerminal() {
        this.money = 1000.00;
        this.change = 0.0;

    }

    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        if (payment >= AFFORDABLE_PRICE) {
            this.money += AFFORDABLE_PRICE;
            this.change = payment - AFFORDABLE_PRICE;
            affordableMeals++;
        } else this.change = payment;
        return this.change;
    }

    public boolean eatAffordably(PaymentCard card) {
        if (card.balance() >= AFFORDABLE_PRICE) {
            card.takeMoney(AFFORDABLE_PRICE);
            affordableMeals++;
            return true;
        }
        return false;
    }


    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        if (payment >= HEARTILY_PRICE) {
            this.money += HEARTILY_PRICE;
            this.change = payment - HEARTILY_PRICE;
            heartyMeals++;
        } else this.change = payment;
        return this.change;
    }

    public boolean eatHeartily(PaymentCard card) {
        if (card.balance() >= HEARTILY_PRICE) {
            card.takeMoney(HEARTILY_PRICE);
            heartyMeals++;
            return true;
        }
        return false;
    }

    public void addMoneyToCard(PaymentCard card, double money) {
        if (money > 0) {
            this.money += money;
            card.addMoney(money);
        }
    }


    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
