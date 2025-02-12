package dynamic_online_marketplace;
import static dynamic_online_marketplace.ProductInfromation.*;
public class MarketPlace {
    public static void main(String[] args) {

        BookCategory bookCategory = new BookCategory();
        ClothingCategory clothingCategory = new ClothingCategory();
        GadgetsCategory gadgetCategory = new GadgetsCategory();

        Product<BookCategory> books=new Product<>("The Girl In Room 105",145,bookCategory);
        Product<ClothingCategory> clothing=new Product<>("Shirt",2435,clothingCategory);
        Product<GadgetsCategory> gadgets=new Product<>("SmartPhone",3445,gadgetCategory);

        ProductInfromation productInfromation=new ProductInfromation();
        productInfromation.addProduct(books);
        productInfromation.addProduct(clothing);
        productInfromation.addProduct(gadgets);

        productInfromation.displayProduct();

        System.out.println("\nAfter Discount");

        DiscountManager.discountManager(books,12);
        DiscountManager.discountManager(clothing,40);
        DiscountManager.discountManager(gadgets,34);

        productInfromation.displayProduct();

    }
}
