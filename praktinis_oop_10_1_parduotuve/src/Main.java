public class Main {
    public static void main(String[] args) {
        Product aspirin = new Drugs("Aspirin", 1.99);
        System.out.println(aspirin.getPriceWithTax());
        System.out.println(aspirin);

        Product socks = new RegularItem("Socks", 2.99);
        System.out.println(socks.getPriceWithTax());
        System.out.println(socks);

        Product sangria = new Wine("Sangria", 6.99, 0.7, 8.0);
        System.out.println(sangria.getPriceWithTax());
        System.out.println(sangria);

        Product beer = new AlcoholicBeverage("Beer", 1.50, 0.33, 8.0);
        System.out.println(beer.getPriceWithTax());
        System.out.println(beer);

        Product nonAlcoholicBeer = new AlcoholicBeverage("0.0 Beer", 1.10, 0.5, 0.0);
        System.out.println(nonAlcoholicBeer.getPriceWithTax());
        System.out.println(nonAlcoholicBeer);

        ProductList newList = new ProductList();
        newList.addProduct(sangria);
        newList.addProduct(socks);
        newList.addProduct(beer);
        System.out.println(newList);

    }
}
