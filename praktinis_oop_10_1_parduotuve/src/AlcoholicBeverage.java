public class AlcoholicBeverage extends Product {

    public final double EXCISE_TAX_LESS_ALC;
    public final double EXCISE_TAX_MORE_ALC;
    public double alcoholContent;
    public double volume;

    public AlcoholicBeverage(String name, double price, double volume, double alcoholContent) {
        super(name, price);
        this.volume = volume;
        this.alcoholContent = alcoholContent;
        //Excise tax in Euros per litre
        this.EXCISE_TAX_LESS_ALC = 0.89;
        this.EXCISE_TAX_MORE_ALC = 1.26;
    }


    @Override
    public double getPriceWithTax() {
        if (alcoholContent  <= 0.5) return super.nettPrice * TAX;
        else if (alcoholContent > 0.5 && alcoholContent <= 15 ) return super.nettPrice * TAX + volume * EXCISE_TAX_LESS_ALC;
        return super.nettPrice * TAX + volume * EXCISE_TAX_MORE_ALC;
    }
}
