package personalized_meal_plan_generator;

public class MealPlanGenerator {
    public static void main(String[] args) {
        Meal<VegetarianMeal> vegetarianMeal = Meal.generateMealPlan(new VegetarianMeal());
        Meal<VeganMeal> veganMeal = Meal.generateMealPlan(new VeganMeal());
        Meal<HighProtienMeal> highProteinMealMeal=Meal.generateMealPlan(new HighProtienMeal());


        System.out.println(vegetarianMeal.getMealDetails());
        System.out.println(veganMeal.getMealDetails());
        System.out.println(highProteinMealMeal.getMealDetails());
    }
}