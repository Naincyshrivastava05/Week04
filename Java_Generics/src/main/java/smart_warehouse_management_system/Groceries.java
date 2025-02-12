package smart_warehouse_management_system;

public class Groceries extends WarehouseItem {
    public Groceries(String name, double price){
        super(name,price);
    }

    @Override
    public String getCategory() {
        return "Groceries";
    }
}
