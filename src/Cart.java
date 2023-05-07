import java.util.ArrayList;
import java.util.List;

public class Cart {
    private double total;
    private List<Product> cartProduct;

    public Cart() {
        total = 0;
        cartProduct = new ArrayList<>();

    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total += total;
    }

    public List<Product> getCartProduct() {
        return cartProduct;
    }

    public void setCartProduct() {
        this.cartProduct = cartProduct;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "total=" + total +
                ", cartProduct=" + cartProduct +
                '}';
    }
}
