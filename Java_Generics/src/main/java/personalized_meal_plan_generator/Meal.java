package personalized_meal_plan_generator;

public class Meal<T extends MealPlan> {
    private T mealPlan;

    public Meal(T mealPlan) {
        this.mealPlan = mealPlan;
    }

    public String getMealDetails() {
        return mealPlan.getMealDetails();
    }

    public static <T extends MealPlan> Meal<T> generateMealPlan(T mealPlan) {
        if (mealPlan == null) {
            throw new IllegalArgumentException("Invalid Meal Plan");
        }
        return new Meal<>(mealPlan);
    }
}