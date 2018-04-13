package ro.lucas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

import ro.lucas.cashregister.Register;
import ro.lucas.entities.Cart;
import ro.lucas.entities.Drink;
import ro.lucas.entities.MeatMenus;
import ro.lucas.entities.Product;
import ro.lucas.enums.Categories;
import ro.lucas.enums.CookLevel;

import static ro.lucas.enums.Categories.DESERT;

class Functionality {

    private static double VAT = 0;

    static void chooseCategory(Cart cart, ArrayList<Product> products) {
        System.out.println("Please choose the category of item you want to buy");
        Arrays.asList(Categories.values()).forEach(p -> System.out.println(p.getId() + ". " + p.name()));
        Scanner sc = new Scanner(System.in);

        int id = sc.nextInt();

        Optional<Categories> chosenCategory = Arrays.stream(Categories.values()).filter(p -> p.getId() == id).findFirst();

        if (chosenCategory.isPresent()){
            showItemsFromCategory(chosenCategory.get(), cart, products);
        }else
            Messages.idNotValidWarning();

    }

    private static void showItemsFromCategory(Categories chosenCategory, Cart cart, ArrayList<Product> products) {
        System.out.println("These items are in the category you have chosen");
        List<Product> productList = products.stream().filter(p->p.getCategory() == chosenCategory).collect(Collectors.toList());

        productList.forEach(p-> System.out.println(p.getId()+ ". "  + p.getName()));

        Scanner sc = new Scanner(System.in);

        int id = sc.nextInt();

        Optional<Product> chosenProduct = productList.stream().filter(p -> p.getId() == id).findFirst();

        if (chosenProduct.isPresent()){
            showOptionsForProduct(chosenProduct.get(), cart, products);
        }else
            Messages.idNotValidWarning();

    }

    private static void showOptionsForProduct(Product chosenProduct, Cart cart, ArrayList<Product> products) {
        Messages.getMessageForProduct(chosenProduct);
        Scanner sc = new Scanner(System.in);

        int op = sc.nextInt();
        productOptions(op, chosenProduct, cart, products);


    }

    private static void productOptions(int op, Product chosenProduct, Cart cart, ArrayList<Product> products) {

        switch (op){
            case 1: addToCart(chosenProduct, cart, products);
                break;
            case 2: showIngredients(chosenProduct, cart, products);
                break;
            case 3:
                System.out.println("Taking you back to main menu");
                break;
            default:
                Messages.idNotValidWarning();
                break;
        }
    }

    private static void addToCart(Product product, Cart cart, ArrayList<Product> products) {
        if(product instanceof MeatMenus) {
            optionsForMeatMenu(product, products,cart);
        }else{
            if(product instanceof Drink)
            doIfDrink(product, cart);
            else {
                cart.getProd().add(product);
                System.out.println("Item added to cart");
            }
        }


    }

    private static void doIfDrink(Product product, Cart cart) {
        if (product instanceof Drink) {
            if (((Drink) product).isInStock()) {
                cart.getProd().add(product);
                System.out.println("Item added to cart");
            } else {
                System.out.println("Product is not in stock");
            }
        }
    }

    private static void optionsForMeatMenu(Product product, ArrayList<Product> products, Cart cart) {
        chooseSideDish((MeatMenus) product, products);
        chooseCooklvl((MeatMenus) product);
        cart.getProd().add(product);
        System.out.println("Item added to cart");
    }

    private static void chooseCooklvl(MeatMenus product) {
        System.out.println("You can also choose if how cooked you want your meat");
        Arrays.stream(CookLevel.values()).forEach(p-> System.out.println(p.getId() +". " + p.name()));

        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();

        Optional<CookLevel> chosenCooklvl =  Arrays.stream(CookLevel.values()).filter(cookLevel -> cookLevel.getId() == id).findFirst();

        if (chosenCooklvl.isPresent())
            product.setLevel(chosenCooklvl.get());
        else
            Messages.idNotValidWarning();
    }

    private static void chooseSideDish(MeatMenus product, ArrayList<Product> products) {
        System.out.println("Seems you have chosen a meat item! Would you like a side dish with that? You can choose from the following options");
        List<Product> sidedishes =  products.stream().filter(Functionality::isSideDish).collect(Collectors.toList());
        sidedishes.forEach(p-> System.out.println(p.getId() + ". " + p.getName()));

        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        Optional<Product> chosenSD = sidedishes.stream().filter(p->p.getId() == id).findFirst();

        if (chosenSD.isPresent())
            product.setSideDish(chosenSD.get());
        else
            Messages.idNotValidWarning();
    }

    private static boolean isSideDish(Product product){
                return product.getCategory().equals(Categories.SIDEDISH);
    }

    private static void showIngredients(Product chosenProduct, Cart cart, ArrayList<Product> products) {
        chosenProduct.getIngredients().forEach(System.out::println);
        showOptionsForProduct(chosenProduct, cart, products);
    }

    static void listCart(Cart cart){
        System.out.println("Your cart has the following items");
        cart.getProd().forEach(p-> System.out.println(p.getName()));
    }


    static void printReceipt(Cart cart){

        double totalPrice = cart.getProd().stream().mapToDouble(Functionality::calculatePrice).sum();
        Register.addMoney(totalPrice);
        System.out.println("You have to pay " + totalPrice +" and from that price your VAT is " + VAT);

    }

    private static double calculatePrice(Product product){
        if(product.getCategory().equals(DESERT)){
            VAT = getVAT(10, product.getPrice()) + VAT;
            return getVAT(10, product.getPrice()) + product.getPrice();
        }else if(product instanceof Drink) {
            if (!((Drink) product).isHealthy()) {
                VAT = getVAT(12, product.getPrice()) + VAT;
                return getVAT(12, product.getPrice()) + product.getPrice();
            }
            VAT = getVAT(5, product.getPrice()) + VAT;
            return getVAT(5, product.getPrice()) + product.getPrice();
        }else{
            VAT = getVAT(9, product.getPrice()) + VAT;
            return getVAT(9, product.getPrice()) + product.getPrice();
        }
    }

    private static double getVAT( double percent, double price){
        return percent / 100 * price;
    }

}
