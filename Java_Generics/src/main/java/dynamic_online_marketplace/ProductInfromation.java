package dynamic_online_marketplace;

import java.util.*;

public class ProductInfromation {
    private List<Product<? extends Category>> products = new ArrayList<>();

    public void addProduct(Product<? extends Category> product) {
        products.add(product);
    }

    public void displayProduct() {
        for (Product<?> product : products) {
            System.out.println(product);
        }
    }
}