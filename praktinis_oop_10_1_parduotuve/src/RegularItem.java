public class RegularItem extends Product{

    public RegularItem(String name, double price) {
        super(name, price);
    }

    @Override
    public double getPriceWithTax(){
        return super.nettPrice * TAX;
    }



}
