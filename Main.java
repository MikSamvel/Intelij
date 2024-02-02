package project;
import java.util.List;



        import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShoppingCart shoppingCart = new ShoppingCart();

        System.out.println("Welcome to Samvel's Online Shopping!");
        Product product1 = new Product("p1", 11);
        Product product2 = new Product("p2", 12);
        Product product3 = new Product("p3", 13);
        Product product4 = new Product("p4", 14);
        Product product5 = new Product("p5", 15);
        shoppingCart.addToCart(product1,1);
        shoppingCart.addToCart(product5,2);
        shoppingCart.addToCart(product2,3);
        shoppingCart.addToCart(product4,1);
        shoppingCart.viewCart();
        shoppingCart.checkout();
    }
}
