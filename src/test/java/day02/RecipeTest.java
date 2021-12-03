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
    void testGeneratingNameAndDesc() {
        Recipe recipe = new Recipe("fröccs", "klasszikus nyári firssítő");
        assertEquals("fröccs", recipe.getName());
        assertEquals("klasszikus nyári firssítő", recipe.getDescription());
    }

    @Test
    void testAddIngredient() {
        List<String> drinkRecipe = new ArrayList<>();
        drinkRecipe.add("bor");
        drinkRecipe.add("szóda");
        drinkRecipe.add("jég");
        Recipe recipe = new Recipe("fröccs", "klasszikus nyári firssítő");
        recipe.addIngredient("bor", "szóda");

        assertEquals("fröccs", recipe.getName());
        assertEquals(2, recipe.getIngredients().size());
    }

}