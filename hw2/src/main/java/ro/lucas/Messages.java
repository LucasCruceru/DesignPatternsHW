package ro.lucas;

import ro.lucas.entities.Product;

public class Messages {

    static void startMessage(){

        StringBuilder sb = new StringBuilder();

        sb.append("Please select your option: \n")
                .append("1. List menu \n")
                .append("2. Show Cart \n")
                .append("3. Get receipt \n")
                .append("4. Close the app \n");

        System.out.println(sb.toString());
    }

    public static void idNotValidWarning() {
        System.out.println("The id you added is not a valid one");
    }

    public static void getMessageForProduct(Product chosenProduct) {
        StringBuilder sb = new StringBuilder();

        sb.append("The item you have chosen is " + chosenProduct.getName()+ " you have the following options: \n")
                .append("1. Add item to cart \n")
                .append("2. Show ingredients \n")
                .append("3. Back to main menu \n");

        System.out.println(sb);
    }
}
