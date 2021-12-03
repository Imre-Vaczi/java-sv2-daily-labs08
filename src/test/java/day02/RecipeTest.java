package day02;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RecipeTest {

    @Test
    void testGeneratingNameOnly() {
        Recipe recipe = new Recipe("fröccs");
        assertEquals("fröccs", recipe.getName());
        assertEquals(0, recipe.getIngredients().size());
    }

    @Test
    void testGeneratingNameAndIngredient() {
        Recipe recipe = new Recipe("fröccs", Arrays.asList("bor"));
        assertEquals("fröccs", recipe.getName());
        assertEquals(1, recipe.getIngredients().size());
    }

    @Test
    void testAddIngredient() {
        List<String> drinkRecipe = new ArrayList<>();
        drinkRecipe.add("bor");
        drinkRecipe.add("szóda");
        drinkRecipe.add("jég");
        Recipe recipe = new Recipe("fröccs", drinkRecipe);
        recipe.addIngredient("extra bor", "extra szóda");

        assertEquals("fröccs", recipe.getName());
        assertEquals(5, recipe.getIngredients().size());
    }

}