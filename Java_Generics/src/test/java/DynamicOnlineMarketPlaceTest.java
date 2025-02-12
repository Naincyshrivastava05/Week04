
import dynamic_online_marketplace.*;
        import org.junit.jupiter.api.BeforeEach;
        import org.junit.jupiter.api.Test;

        import static org.junit.jupiter.api.Assertions.*;

class DynamicOnlineMarketPlaceTest {
    BookCategory bookCategory = new BookCategory();
    ClothingCategory clothingCategory = new ClothingCategory();
    GadgetsCategory gadgetCategory = new GadgetsCategory();
    Product<BookCategory> books=new Product<>("The Girl In Room 105",145,bookCategory);
    Product<ClothingCategory> clothing=new Product<>("Shirt",2435,clothingCategory);
    Product<GadgetsCategory> gadgets=new Product<>("SmartPhone",3445,gadgetCategory);
    ProductInfromation productInfromation=new ProductInfromation();

    @BeforeEach
    void setUp() {
        productInfromation.addProduct(books);
        productInfromation.addProduct(clothing);
        productInfromation.addProduct(gadgets);

    }
    @Test
    void testAddAndGetItem() {
        assertEquals(books.getName(),"The Girl In Room 105");
        assertEquals(clothing.getName(),"Shirt");
        assertEquals(gadgets.getName(),"SmartPhone");


        assertEquals(books.getPrice(),145);
        assertEquals(clothing.getPrice(),2435);
        assertEquals(gadgets.getPrice(),3445);

        assertEquals(books.getCategory().getCategoryName(),"Books");
        assertEquals(clothing.getCategory().getCategoryName(),"Clothing");
        assertEquals(gadgets.getCategory().getCategoryName(),"Gadgets");

    }

    @Test
    void testAfterDiscount(){
        DiscountManager.discountManager(books,12);
        DiscountManager.discountManager(clothing,40);
        DiscountManager.discountManager(gadgets,34);

        assertEquals(books.getPrice(),127.6);
        assertEquals(clothing.getPrice(),1461.0);
        assertEquals(gadgets.getPrice(),2273.7);
    }



}