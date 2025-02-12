package smart_warehouse_management_system;

public class SmartWarehouseSystem {
    public static void main(String[] args) {
        Storage<Electronics> electronics = new Storage<>();
        Storage<Furniture> furniture = new Storage<>();
        Storage<Groceries> groceries = new Storage<>();

        electronics.addItem(new Electronics("Macbook",65000));
        electronics.addItem(new Electronics("iPad",5000));
        furniture.addItem(new Furniture("Chair",500));
        furniture.addItem(new Furniture("Table",1500));
        groceries.addItem(new Groceries("Milk",60));
        groceries.addItem(new Groceries("Break",60));

        System.out.println("Electronics Item:-");
        WarehouseUtils.displayItem(electronics.getItems());

        System.out.println("Furniture Item:-");
        WarehouseUtils.displayItem(furniture.getItems());

        System.out.println("Groceries Item:-");
        WarehouseUtils.displayItem(groceries.getItems());

    }
}
