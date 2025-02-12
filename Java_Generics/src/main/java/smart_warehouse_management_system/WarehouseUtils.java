package smart_warehouse_management_system;

import java.util.List;

public class WarehouseUtils {
    public static void displayItem(List<? extends WarehouseItem> items){
        for(WarehouseItem item: items){
            System.out.println(item.display());
        }
    }
}
