package ro.lucas;

import ro.lucas.entities.Cart;
import ro.lucas.entities.Product;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;

public class Functionality {

    private static double cartPrice = 0;

    static Cart addToCart(Cart cart, ArrayList<Product> products) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please add the id of the item you want to add to your cart");
        int itemId = sc.nextInt();

        Optional<Product> product = products.stream().filter(p -> p.getId() == itemId).findFirst();

        if (product.isPresent()){
            cart.getProd().add(product.get());
            System.out.println("Item added to cart");
        }else
            System.out.println("The id you added is not a valid one");
        return cart;
    }

    static void listItems(ArrayList<Product> prod){
        generateTableHeader();
        prod.forEach(Functionality::showItem);
    }

    static void listCart(Cart cart){
        generateTableHeader();
        cart.getProd().forEach(Functionality::showItem);
    }


    static void checkout(Cart cart, double transp){

        cart.getProd().forEach(prod -> calculatePrice(prod.getPrice()));

        double fullPrice = transp + cartPrice;

        System.out.println("Comanda dvs. in valoare totala de " + fullPrice + "(din care "+ cartPrice +" valoare produse si "
                + transp +" valoare transport), a fost expediata. Va multumim!");

    }

    private static void calculatePrice(double price){
        cartPrice = price + cartPrice;
    }

    private static void generateTableHeader() {
        StringBuilder sb = new StringBuilder();

        sb.append("| ")
                .append("ID")
                .append(" | ")
                .append("NAME")
                .append(" | ")
                .append("UNIT")
                .append(" | ")
                .append("PRICE")
                .append(" |");

        System.out.println(sb);
    }

    private static void showItem(Product prod){
        StringBuilder sb = new StringBuilder();

        sb.append("| ")
                .append(prod.getId())
                .append(" | ")
                .append(prod.getName())
                .append(" | ")
                .append(prod.getUnit().toString())
                .append(" | ")
                .append(prod.getPrice())
                .append(" |");

        System.out.println(sb);
    }

}
