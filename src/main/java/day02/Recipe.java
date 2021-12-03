package day02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Recipe {

    private String name;
    private List<String> ingredients = new ArrayList<>();

    public Recipe(String name) {
        this.name = name;
    }

    public Recipe(String name, List<String> ingredients) {
        this.name = name;
        this.ingredients = ingredients;
    }

    public void addIngredient(String... components) {
        for (String comp : components) {
            ingredients.add(comp);
        }
    }

    public String getName() {
        return name;
    }

    public List<String> getIngredients() {
        return ingredients;
    }
}
