package ro.lucas;

import ro.lucas.entities.Product;
import ro.lucas.entities.Unit;

import java.util.ArrayList;

public class DBMock{


    static ArrayList<Product> initProducts(){
        ArrayList<Product> prod = new ArrayList<>();
        prod.add(new Product(1, "Cafea boabe 250g ", 20, Unit.G));
        prod.add(new Product(2, "Cafea boabe 500g ", 35,  Unit.G));
        prod.add(new Product(3, "Cafea boabe 1kg ", 50,  Unit.G));
        prod.add(new Product(4, "Sirop caramel ", 12,  Unit.BUC));

        return prod;
    }
}
