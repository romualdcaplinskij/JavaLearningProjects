
public class Main {

    public static void main(String[] args) {
        // write experimental main programs here

        PaymentCard petesCard = new PaymentCard(10);

        System.out.println("Money " + petesCard.balance());
        boolean wasSuccessful = petesCard.takeMoney(8);
        System.out.println("Successfully withdrew: " + wasSuccessful);
        System.out.println("Money " + petesCard.balance());

        wasSuccessful = petesCard.takeMoney(4);
        System.out.println("Successfully withdrew: " + wasSuccessful);
        System.out.println("Money " + petesCard.balance());

        System.out.println();
        PaymentTerminal unicafeExactum = new PaymentTerminal();

        double change = unicafeExactum.eatAffordably(10);
        System.out.println("Remaining change: " + change);

        change = unicafeExactum.eatAffordably(5);
        System.out.println("Remaining change: " + change);

        change = unicafeExactum.eatHeartily(4.3);
        System.out.println("Remaining change: " + change);

        System.out.println(unicafeExactum);
        System.out.println();


        petesCard.addMoney(10);
        boolean paymentSuccessful = unicafeExactum.eatAffordably(petesCard);
        System.out.println("The payment was successful: " + paymentSuccessful);
        System.out.println(petesCard.balance());
        System.out.println();

        unicafeExactum.addMoneyToCard(petesCard, 50);
        System.out.println(petesCard.balance());

    }
}

