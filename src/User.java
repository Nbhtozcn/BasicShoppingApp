public class User {
    private String name, address;
    private Cart cart;
    private double shippingCost;
    private UserType userType;

    public User(String name, String address) {
        this.name = name;
        this.address = address;
        cart = new Cart();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public double getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(double shippingCost) {
        this.shippingCost = shippingCost;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public void addToCart(Product product) {
        getCart().getCartProduct().add(product);
        getCart().setTotal(product.getPrice());
    }

    public void removeFromCard(Product product) {
        getCart().getCartProduct().remove(product);
        cart.setTotal(-product.getPrice());
    }

}
