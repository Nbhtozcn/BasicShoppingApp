public class RegularBuyer extends Buyer{
    public RegularBuyer(String name, String address) {
        super(name, address);
    }

    @Override
    public void checkOut(PaymentMethod paymentMethod) {
        for (Product product : getCart().getCartProduct()) {
            product.getSeller().sellProduct(product);
        }

        if (paymentMethod.equals(PaymentMethod.CREDITCARD)) {
            System.out.println(getCart().getTotal() + calculateShippingCost() + " has been deducted from your card");
        } else if (paymentMethod.equals(PaymentMethod.CASHonDELIVERY)) {
            System.out.println("The amount you must pay on delivery is " + (getCart().getTotal() + calculateShippingCost()));
        }
    }
    public double calculateShippingCost() {
        if (getCart().getTotal() < 50) {
            return getCart().getTotal() * 0.10;
        }
        return 0;

    }
}
