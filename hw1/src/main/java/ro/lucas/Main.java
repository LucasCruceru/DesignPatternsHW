package ro.lucas;

import java.util.Scanner;

public class Main {

    private static int on = 1;

    public static void main(String[] args) {

        while(on == 1) {
            startMessage();

            Scanner sc = new Scanner(System.in);

            int action = sc.nextInt();

            doAction(action);

        }
    }
    private static void doAction(int action){

        switch (action){
            case 1:
                System.out.println("works");
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

    private static void startMessage(){

        StringBuilder sb = new StringBuilder();

        sb.append("Please select your option: \n")
                .append("1. List items \n")
                .append("2. Add item to cart \n")
                .append("3. Show Cart \n")
                .append("4. Checkout \n")
                .append("5. Close the app \n");

        System.out.println(sb.toString());
    }}
