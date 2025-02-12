package dynamic_online_marketplace;

public class DiscountManager {
    public static <T extends Product> void discountManager(T category,double percentage){
        double discountAmount = category.getPrice() * (percentage / 100);
        category.setPrice(category.getPrice() - discountAmount);

    }
}