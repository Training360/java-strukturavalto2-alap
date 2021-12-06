package week8.day02;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RecipeTest {


    @Test
    void createTestByName() {
        Recipe recipe = new Recipe("Gulyás leves");

        assertEquals("Gulyás leves", recipe.getName());
        assertNull(recipe.getDescription());
        assertEquals(0, recipe.getIngredients().size());

    }

    @Test
    void createTestByNameAndDescription() {
        Recipe recipe = new Recipe("Gulyás leves", "Nagyon finom");

        assertEquals("Gulyás leves", recipe.getName());
        assertEquals("Nagyon finom", recipe.getDescription());
        assertEquals(0, recipe.getIngredients().size());

    }

//    @Test
//    void addOneIngredient(){
//        Recipe recipe = new Recipe("Gulyás leves", "Nagyon finom");
//
//        recipe.addIngredient("hagyma");
//
//        assertEquals("hagyma",recipe.getIngredients().get(0));
//    }
//
//    @Test
//    void addMoreIngredients(){
//        Recipe recipe = new Recipe("Gulyás leves", "Nagyon finom");
//
//        recipe.addIngredient("hagyma","hús","répa");
//
//        assertEquals(3, recipe.getIngredients().size());
//        assertEquals(List.of("hagyma","hús","répa"), recipe.getIngredients());
//    }

}