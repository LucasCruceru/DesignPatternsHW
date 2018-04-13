package ro.lucas;

import java.util.ArrayList;
import java.util.Scanner;

import ro.lucas.entities.Cart;
import ro.lucas.entities.Product;


public class Main {

    private static int on = 1;

    static Cart cart = new Cart(1, new ArrayList<>());

    static ArrayList<Product> products = DBMock.initProducts();

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
                Functionality.chooseCategory(cart, products);
                break;
            case 2:
                Functionality.listCart(cart);
                break;
            case 3:
                Functionality.printReceipt(cart);
                break;
            case 4:
                closeApp();
                break;
            default:
                Messages.idNotValidWarning();
                break;
        }
    }

    private static void closeApp() {
        System.out.println("Closing app");
        on = 0;
    }
}
