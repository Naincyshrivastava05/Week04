import java.util.*;

class ShoppingCart {
    private final Map<String, Double> productPrices;
    private final LinkedHashMap<String, Double> cart;
    private final TreeMap<Double, String> sortedItems;

    public ShoppingCart() {
        this.productPrices = new HashMap<>();
        this.cart = new LinkedHashMap<>();
        this.sortedItems = new TreeMap<>();
    }

    public void addProduct(String product, double price) {
        productPrices.put(product, price);
        cart.put(product, price);
        sortedItems.put(price, product);
    }

    public Map<String, Double> getCartOrder() {
        return new LinkedHashMap<>(cart);
    }

    public Map<Double, String> getSortedItems() {
        return new TreeMap<>(sortedItems);
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct("Apple", 1.5);
        cart.addProduct("Banana", 1.0);
        cart.addProduct("Orange", 2.0);

        System.out.println("Cart Order: " + cart.getCartOrder());
        System.out.println("Sorted Items by Price: " + cart.getSortedItems());
    }
}
