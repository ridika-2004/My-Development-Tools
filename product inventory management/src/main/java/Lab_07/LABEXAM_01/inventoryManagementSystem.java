package Lab_07.LABEXAM_01;

import java.util.ArrayList;
import java.util.Arrays;

public class inventoryManagementSystem {
	 public static void main(String[] args) {
	        inventorySystem system = new inventorySystem();
	        
	        
	        globalInventoryData.warehouses.put(1, new Warehouse(1, "Main Warehouse", "New York"));
	        globalInventoryData.warehouses.put(2, new Warehouse(2, "Secondary Warehouse", "Los Angeles"));
	        
	    
	        system.addProduct("Laptop", 1000.0, "Electronics", 50, 1, "percentage", 10);
	        system.addProduct("Mouse", 20.0, "Electronics", 100, 1, "bulk", 15);
	        system.addProduct("Desk", 200.0, "Furniture", 30, 2, "seasonal", 20);
	        

	        ArrayList<Integer> productIds = new ArrayList<>(Arrays.asList(1, 2));
	        ArrayList<Integer> quantities = new ArrayList<>(Arrays.asList(2, 5));
	        system.processOrder(productIds, quantities, "John Doe, 123 Main St");
	        
	        System.out.println(system.GenerateInventoryReport());
	        System.out.println(system.GenerateSalesReport());
	    }
}
