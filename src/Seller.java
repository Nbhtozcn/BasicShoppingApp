import java.util.ArrayList;
import java.util.List;

public abstract class Seller extends User {
    private List<Product> products;
    private double balance;
    private double feeFromPerSale;

    public Seller(String name, String address) {
        super(name, address);
        this.balance = 0;
        products = new ArrayList<>();
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getFeeFromPerSale() {
        return feeFromPerSale;
    }

    public void setFeeFromPerSale(double feeFromPerSale) {
        this.feeFromPerSale = feeFromPerSale;
    }


    public void addProduct(Product product) {
        product.setSeller(this);
        products.add(product);
    }

    public abstract void sellProduct(Product product);


}
