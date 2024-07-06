public class Drugs extends Product {

    public final double TAX;

    public Drugs(String name, double price) {
        super(name, price);
        this.TAX = 1.09;
    }

    @Override
    public double getPriceWithTax() {
        return super.nettPrice * TAX;
    }
}
