package ro.lucas;

import ro.lucas.entities.Cart;
import ro.lucas.entities.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static int on = 1;

    static Cart cart = new Cart(1, new ArrayList<>());

    static ArrayList<Product> products = DBMock.initProducts();

    static double transportPrice = 12;

    public static void main(String[] args) {

        while(on == 1) {
            Messages.startMessage();

            Scanner sc = new Scanner(System.in);

            int action = sc.nextInt();

            doAction(action);

        }
    }
    private static void doAction(int action){

        switch (action){
            case 1:
                Functionality.listItems(products);
                break;
            case 2:
                Functionality.addToCart(cart, products);
                break;
            case 3:
                Functionality.listCart(cart);
                break;
            case 4:
                Functionality.checkout(cart, transportPrice);
                break;
            case 5:
                closeApp();
                break;
        }
    }

    private static void closeApp() {
        System.out.println("Closing app");
        on = 0;
    }
    }
