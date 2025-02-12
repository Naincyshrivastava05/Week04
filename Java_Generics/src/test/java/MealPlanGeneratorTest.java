import org.junit.jupiter.api.Test;
import personalized_meal_plan_generator.HighProtienMeal;
import personalized_meal_plan_generator.Meal;
import personalized_meal_plan_generator.VeganMeal;
import personalized_meal_plan_generator.VegetarianMeal;

import static org.junit.jupiter.api.Assertions.*;

class MealPlanGeneratorTest {
    @Test
    void testVegetarianMealDetails() {
        Meal<VegetarianMeal> meal = Meal.generateMealPlan(new VegetarianMeal());
        assertEquals("Vegetarian Meal:  vegetables, bread, and chapati.", meal.getMealDetails());
    }

    @Test
    void testVeganMealDetails() {
        Meal<VeganMeal> meal = Meal.generateMealPlan(new VeganMeal());
        assertEquals("Vegan Meal:  soup,  salad, and brown bread.", meal.getMealDetails());
    }



    @Test
    void testHighProteinMealDetails() {
        Meal<HighProtienMeal> meal = Meal.generateMealPlan(new HighProtienMeal());
        assertEquals("High Protein Meal:  eggs, chicken , and  cheese.", meal.getMealDetails());
    }

    @Test
    void testInvalidMealPlan() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Meal.generateMealPlan(null);
        });
        assertEquals("Invalid Meal Plan", exception.getMessage());
    }
}