# Shopping Application

This is a basic shopping application that allows users to purchase products from different sellers. The application is implemented in Java 
and uses several object-oriented programming concepts to organize its classes and data.

## Classes

The application has the following classes:

- `Buyer`: An abstract class that represents a buyer. It is extended by the `PremiumBuyer` and `RegularBuyer` classes.

- `Seller`: An abstract class that represents a seller. It is extended by the `PremiumSeller` and `RegularSeller` classes.

- `Product`: A class that represents a product. It contains information such as the product name, description, price, and seller.

- `Cart`: A class that represents a user's shopping cart. It contains a list of products that the user has added to their cart.

- `User`: A class that represents a user. It contains information such as the user's name, address.

## Enums

The application has the following enums:

- `PaymentMethod`: An enum that represents a payment method. It contains values such as "CreditCard" and "CashOnDelivery".

- `UserType`: An enum that represents a user type. It contains values such as "Premium" and "Regular".

## Usage

To use the application, follow these steps:

1. Clone the repository to your local machine.

2. Open the project in your favorite IDE or text editor.

3. Build the project and run the `Main` class.

4. Once the application is running, you can use the following menu options to browse and purchase products:

- Add to cart: Allows you to add a product to your shopping cart.

- Remove from cart: Allows you to remove a product from your shopping cart.

- Checkout: Allows you to checkout your shopping cart and make a payment.

5. Follow the prompts and input the necessary information to complete your selected transaction.

## Contributing

If you would like to contribute to the development of this application, feel free to fork the repository and submit a pull request with your changes.
