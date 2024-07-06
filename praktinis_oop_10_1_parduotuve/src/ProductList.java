import java.util.ArrayList;

public class ProductList {

    public ArrayList<Product> products;

    public ProductList() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product item){
        products.add(item);
    }

    @Override
    public String toString() {
        return "ProductList: " + products;
    }
}
