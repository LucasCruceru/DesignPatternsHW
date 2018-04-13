package ro.lucas;

import java.util.ArrayList;
import java.util.Arrays;

import ro.lucas.entities.MeatMenus;
import ro.lucas.enums.Categories;
import ro.lucas.entities.Drink;
import ro.lucas.entities.Product;
import ro.lucas.enums.Ingredients;

public class DBMock {

    /**
     * I used the same database mocking rudimentary technique to avoid database connections and SQL scripts (made for ease of use)
     * WARNING : For lack of time the ingredients are NOT in concordance with reality
     * @return already initialised array of products
     */
    static ArrayList<Product> initProducts(){
        ArrayList<Product> prod = new ArrayList<>();
        prod.add(new Product(1, "Capriciosa", 15, Categories.PIZZA, new ArrayList<>(Arrays.asList(Ingredients.LEMON, Ingredients.LOBSTER))));
        prod.add(new Product(2, "Margherita", 15, Categories.PIZZA, new ArrayList<>(Arrays.asList(Ingredients.LEMON, Ingredients.LOBSTER))));
        prod.add(new Product(3, "Quattro stagioni", 15, Categories.PIZZA, new ArrayList<>(Arrays.asList(Ingredients.LEMON, Ingredients.LOBSTER))));
        prod.add(new Product(4, "Prosciuto e funghi", 15, Categories.PIZZA, new ArrayList<>(Arrays.asList(Ingredients.LEMON, Ingredients.LOBSTER))));

        prod.add(new Product(5, "Carbonara", 20, Categories.PASTA, new ArrayList<>(Arrays.asList(Ingredients.LEMON, Ingredients.SALT))));
        prod.add(new Product(6, "Sea food", 20, Categories.PASTA, new ArrayList<>(Arrays.asList(Ingredients.LEMON, Ingredients.SALT, Ingredients.LOBSTER, Ingredients.SHRIMP))));
        prod.add(new Product(7, "Gnochi", 20, Categories.PASTA, new ArrayList<>(Arrays.asList(Ingredients.LEMON, Ingredients.SALT))));
        prod.add(new Product(8, "Quatro fromaggi", 20, Categories.PASTA, new ArrayList<>(Arrays.asList(Ingredients.LEMON, Ingredients.SALT))));

        prod.add(new Product( 9, "French fries", 5, Categories.SIDEDISH, new ArrayList<>(Arrays.asList(Ingredients.SALT, Ingredients.PEPPER))));
        prod.add(new Product( 10, "Rice", 5, Categories.SIDEDISH, new ArrayList<>(Arrays.asList(Ingredients.SALT, Ingredients.PEPPER))));
        prod.add(new Product( 11, "Mashed potatoes", 5, Categories.SIDEDISH, new ArrayList<>(Arrays.asList(Ingredients.SALT, Ingredients.PEPPER))));

        prod.add(new Product( 12, "Ketchup", 2, Categories.DRESSING, new ArrayList<>(Arrays.asList(Ingredients.SALT, Ingredients.PEPPER))));
        prod.add(new Product( 13, "Mayo", 2, Categories.DRESSING, new ArrayList<>(Arrays.asList(Ingredients.SALT, Ingredients.PEPPER))));
        prod.add(new Product( 14, "Tzatziki", 3, Categories.DRESSING, new ArrayList<>(Arrays.asList(Ingredients.SALT, Ingredients.PEPPER))));

        prod.add(new Product( 15, "Lava cake", 10, Categories.DESERT, new ArrayList<>(Arrays.asList(Ingredients.SUGAR, Ingredients.LEMON))));
        prod.add(new Product( 16, "Icecream", 10, Categories.DESERT, new ArrayList<>(Arrays.asList(Ingredients.SUGAR, Ingredients.LEMON))));

        prod.add(new MeatMenus(17, "Chicken", 10, new ArrayList<>(Arrays.asList(Ingredients.LEMON, Ingredients.LOBSTER))));
        prod.add(new MeatMenus(18, "Duck", 12, new ArrayList<>(Arrays.asList(Ingredients.LEMON, Ingredients.LOBSTER))));
        prod.add(new MeatMenus(19, "Hamburger", 10, new ArrayList<>(Arrays.asList(Ingredients.LEMON, Ingredients.LOBSTER))));
        prod.add(new MeatMenus(20, "Steak", 10, new ArrayList<>(Arrays.asList(Ingredients.LEMON, Ingredients.LOBSTER))));
        prod.add(new MeatMenus(21, "Pork-chops", 10, new ArrayList<>(Arrays.asList(Ingredients.LEMON, Ingredients.LOBSTER))));

        prod.add(new Drink(22,"Cola",5, 4, false ,new ArrayList<>(Arrays.asList(Ingredients.LEMON, Ingredients.LOBSTER))));
        prod.add(new Drink(23,"Fanta",5, 4, false ,new ArrayList<>(Arrays.asList(Ingredients.LEMON, Ingredients.LOBSTER))));
        prod.add(new Drink(24,"Sprite",5, 4, false ,new ArrayList<>(Arrays.asList(Ingredients.LEMON, Ingredients.LOBSTER))));
        prod.add(new Drink(25,"Water",5, 4, true ,new ArrayList<>(Arrays.asList(Ingredients.LEMON, Ingredients.LOBSTER))));
        prod.add(new Drink(26,"Lemonade",5, 4, true ,new ArrayList<>(Arrays.asList(Ingredients.LEMON, Ingredients.LOBSTER))));
        prod.add(new Drink(27,"Fresh",5, 4, true ,new ArrayList<>(Arrays.asList(Ingredients.LEMON, Ingredients.LOBSTER))));
        prod.add(new Drink(28,"Coffee",5, 4, true ,new ArrayList<>(Arrays.asList(Ingredients.LEMON, Ingredients.LOBSTER))));

        return prod;
    }
}
