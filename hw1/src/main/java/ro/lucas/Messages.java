package ro.lucas;

public class Messages {

    static void startMessage(){

        StringBuilder sb = new StringBuilder();

        sb.append("============================= \n")
                .append("Please select your option: \n")
                .append("1. List items \n")
                .append("2. Add item to cart \n")
                .append("3. Show Cart \n")
                .append("4. Checkout \n")
                .append("5. Close the app \n")
                .append("============================= \n");

        System.out.println(sb.toString());
    }
}
