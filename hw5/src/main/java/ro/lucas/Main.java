package ro.lucas;

import java.util.Scanner;

import ro.lucas.entities.Package;
import ro.lucas.entities.Product;
import ro.lucas.entities.User;

public class Main {
    private static int on = 1;
    public static void main(String[] args) {

        User me = new User("Lucas");
        Package pack1 = new Package("pack1");
        Package pack2 = new Package("pack2");
        Package pack3 = new Package("pack3");
        Package packInside = new Package("inside");
        Product prod = new Product("Shampoo");

        packInside.add(prod);
        pack1.add(packInside);

        me.addPackage(pack1);
        me.addPackage(pack2);
        me.sendPackages();
        me.addPackage(pack3);


        while(on == 1) {

            System.out.println("Type the name of the package you're looking for");

            Scanner sc = new Scanner(System.in);

            String packName = sc.nextLine();

            me.callForPackage(packName);

        }
    }
}
