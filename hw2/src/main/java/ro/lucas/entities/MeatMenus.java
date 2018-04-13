package ro.lucas.entities;

import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;
import ro.lucas.enums.Categories;
import ro.lucas.enums.CookLevel;
import ro.lucas.enums.Ingredients;

@Getter
@Setter
public class MeatMenus extends Product {

    Product sideDish;
    CookLevel level;

    public MeatMenus(int id, String name, double price, ArrayList<Ingredients> ingredients){
        super.setId(id);
        super.setName(name);
        super.setPrice(price);
        super.setCategory(Categories.MEAT);
        super.setIngredients(ingredients);
    }

    @Override
    public double getPrice(){
        return super.getPrice() + sideDish.getPrice();
    }
}
