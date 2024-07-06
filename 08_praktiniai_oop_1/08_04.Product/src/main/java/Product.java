public class Product {

    private String name;
    private double price;
    private int amount;

    public Product(String initialName, double initialPrice, int initialAmount){
        name = initialName;
        price = initialPrice;
        amount = initialAmount;
    }

    public void printProduct(){
        System.out.printf("%s, price %.1f, %d pcs", name, price, amount);
    }


}
