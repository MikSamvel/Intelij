package project;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> cartItems;


    public ShoppingCart() {
        this.cartItems = new ArrayList<>();
    }

    public void addToCart(Product product, int quantity) {
        for (int i = 0; i < quantity; i++) {
            cartItems.add(product);

        }
        product.quantity=quantity;
        System.out.println(product.getName() + " added to cart " + quantity + "x");
    }


    public void removeFromCart(Product product, int quantity) {
        for (int i = 0; i < quantity; i++) {
            cartItems.remove(product);

        }
        product.quantity=quantity;
        System.out.println(product.getName() + " removed from cart." + quantity + "x");

    }


    public void viewCart() {
        System.out.println("\nShopping Cart:");
        boolean b = true;
             for(int i = 0; i < cartItems.size();i++){

                    if (i == 0) {
                        System.out.println(print(cartItems.get(i)));
                    } else if (cartItems.get(i - 1).equals(cartItems.get(i))) {
continue;
                    } else {
                        System.out.println(print(cartItems.get(i)));

                    }
                }

            }



    public void checkout() {
        double total = 0;
        for (Product item : cartItems) {
            total += item.getPrice();
        }

        System.out.println("\nTotal: $" + total);
        System.out.println("Thank you for your purchase!");
        cartItems.clear();
    }
    public  String print(Product item) {
        return ( "Product{" +
                "name='" + item.getName() + '\'' +
                ", price=" + item.getPrice() + "$" +
                ", quantity='" + item.quantity+
                '}');
    }
}

