package day02;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

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
        Recipe recipe = new Recipe("fröccs"); //Arrays.asList("bor")
        recipe.addIngredient("szóda", "bor");
        assertEquals("fröccs", recipe.getName());
        assertEquals(2, recipe.getIngredients().size());
    }

}