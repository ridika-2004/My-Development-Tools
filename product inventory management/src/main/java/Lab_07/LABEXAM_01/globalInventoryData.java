package Lab_07.LABEXAM_01;

import java.util.HashMap;

import Lab_07.LABEXAM_01.inventorySystem.Order;
import Lab_07.LABEXAM_01.inventorySystem.Product;

public class globalInventoryData {
	public static HashMap<Integer, Product> products = new HashMap<>();
    public static HashMap<Integer, Warehouse> warehouses = new HashMap<>();
    public static HashMap<Integer, Order> orders = new HashMap<>();
    public static int currentProductId = 0;
    public static int currentOrderId = 0;
    

    public static double calculateDiscount(double price, double percentage) {
        return price * (1 - percentage / 100);
    }
}
