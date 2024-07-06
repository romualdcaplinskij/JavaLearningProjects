public class Product {

    public String name;
    public double nettPrice;
    public double TAX;
    public double exchageRate;

    public Product(String name, double price) {
        this.name = name;
        this.nettPrice = price;
        this.TAX = 1.21;
        this.exchageRate = 0.98;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return nettPrice;
    }

    public void setPrice(double price) {
        this.nettPrice = price;
    }

    public double getPriceWithTax() {
        return 0.0;
    }

    @Override
    public String toString() {
        return "Product: " +
                "name - " + name +
                ", price - " + nettPrice + " EUR, " + nettPrice * exchageRate + " CHF \n";
    }
}
