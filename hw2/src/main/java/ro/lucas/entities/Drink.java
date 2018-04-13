package ro.lucas.entities;

import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;
import ro.lucas.enums.Categories;
import ro.lucas.enums.Ingredients;

@Getter
@Setter
public class Drink extends Product {

    private int stock;
    private boolean isHealthy;

    public Drink (int id, String name, double price, int stock, boolean isHealthy, ArrayList<Ingredients> ingredients){
        super.setId(id);
        super.setName(name);
        super.setPrice(price);
        super.setCategory(Categories.DRINKS);
        super.setIngredients(ingredients);
        this.stock = stock;
        this.isHealthy = isHealthy;
    }

    public boolean isInStock(){
        if(stock <= 0){
            return false;
        }else {
            stock = stock - 1;
            return true;
        }
    }
}
