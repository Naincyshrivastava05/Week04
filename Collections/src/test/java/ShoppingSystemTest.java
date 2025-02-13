import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class ShoppingSystemTest {
    @Test
    void testShoppingCart() {
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct("Apple", 1.5);
        cart.addProduct("Banana", 1.0);
        cart.addProduct("Orange", 2.0);

        Map<String, Double> order = cart.getCartOrder();
        assertEquals(1.5, order.get("Apple"));
        assertEquals(1.0, order.get("Banana"));
        assertEquals(2.0, order.get("Orange"));

        Map<Double, String> sortedItems = cart.getSortedItems();
        assertEquals("Banana", sortedItems.get(1.0));
        assertEquals("Apple", sortedItems.get(1.5));
        assertEquals("Orange", sortedItems.get(2.0));
    }
}
