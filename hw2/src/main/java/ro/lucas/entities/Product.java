package ro.lucas.entities;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ro.lucas.enums.Categories;
import ro.lucas.enums.Ingredients;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private int id;
    private String name;
    private double price;
    private Categories category;
    private List<Ingredients> ingredients;
}