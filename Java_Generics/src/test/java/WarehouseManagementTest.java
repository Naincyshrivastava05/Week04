import static org.junit.jupiter.api.Assertions.*;
        import org.junit.jupiter.api.BeforeEach;
        import org.junit.jupiter.api.Test;
import smart_warehouse_management_system.Electronics;
import smart_warehouse_management_system.Furniture;
import smart_warehouse_management_system.Groceries;
import smart_warehouse_management_system.Storage;

import java.util.List;

class WarehouseManagementTest {
    private Storage<Electronics> electronicsStorage;
    private Storage<Groceries> groceriesStorage;
    private Storage<Furniture> furnitureStorage;

    @BeforeEach
    void setUp() {
        electronicsStorage = new Storage<>();
        groceriesStorage = new Storage<>();
        furnitureStorage = new Storage<>();
    }

    @Test
    void testAddItem() {
        Electronics laptop = new Electronics("Laptop", 1200);
        electronicsStorage.addItem(laptop);
        assertTrue(electronicsStorage.getItems().contains(laptop));
    }

    @Test
    void testRemoveItem() {
        Furniture chair = new Furniture("Chair", 150);
        furnitureStorage.addItem(chair);
        furnitureStorage.removeItem(chair);
        assertFalse(furnitureStorage.getItems().contains(chair));
    }

    @Test
    void testStorageSize() {
        groceriesStorage.addItem(new Groceries("Apple", 2));
        groceriesStorage.addItem(new Groceries("Milk", 3));
        assertEquals(2, groceriesStorage.getItems().size());
    }

    @Test
    void testDisplayItems() {
        Electronics phone = new Electronics("Smartphone", 800);
        electronicsStorage.addItem(phone);

        List<Electronics> items = electronicsStorage.getItems();
        assertEquals(1, items.size());
        assertEquals("Smartphone", items.get(0).getName());
        assertEquals(800, items.get(0).getPrice());
    }
}
