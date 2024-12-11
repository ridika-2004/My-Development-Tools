package Lab_07.LABEXAM_01;

import java.util.ArrayList;
import java.util.Date;

public class inventorySystem {
    private double totalSales = 0;
    private ArrayList<String> reports = new ArrayList<>();

    public class Product {
        public int id;
        public String name;
        public double basePrice;
        public String category;
        public int stock;
        public int warehouseId;
        public String discountType;
        public double discountValue;
        public double finalPrice;
        
    }

    public class Order {
        public int id;
        public ArrayList<OrderItem> items;
        public double totalPrice;
        public String customerInfo;
        public String status;
        public String createdAt;
        
        
        public class OrderItem {
            public int productId;
            public int quantity;
            public double price;
        }
    }
    
    

    public int addProduct(String name, double price, String category, int stock, int warehouseId, String discountType, double discountValue) {
        try {
            if (name != null && !name.isEmpty()) {
                if (price > 0) {
                    if (category != null) {
                        if (stock >= 0) {
                            if (globalInventoryData.warehouses.containsKey(warehouseId)) {
                                Product product = new Product();
                                globalInventoryData.currentProductId++;
                                product.id = globalInventoryData.currentProductId;
                                product.name = name;
                                product.basePrice = price;
                                product.category = category;
                                product.stock = stock;
                                product.warehouseId = warehouseId;
                                product.discountType = discountType;
                                product.discountValue = discountValue;
                                product.finalPrice = calculateFinalPrice(price, discountType, discountValue);
                                
                                globalInventoryData.products.put(product.id, product);
                                return product.id;
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

    private double calculateFinalPrice(double basePrice, String discountType, double discountValue) {
        double finalPrice = basePrice;
        
        if (discountType != null) {
            switch (discountType.toLowerCase()) {
                case "percentage":
                    finalPrice = basePrice * (1 - discountValue / 100);
                    break;
                case "bulk":
                    
                    if (discountValue >= 10) {
                        finalPrice = basePrice * 0.85;
                    } else {
                        finalPrice = basePrice * 0.95;
                    }
                    break;
                case "seasonal":
                    finalPrice = basePrice * 0.8;
                    if (discountValue > 0) {
                        finalPrice *= (1 - discountValue / 100);
                    }
                    break;
                default:
                    System.out.println("Invalid discount type!");
            }
        }
        
        return finalPrice;
    }

    public double calculateTotalInventoryValue() {
        double total = 0;
        for (Product product : globalInventoryData.products.values()) {
            total += product.finalPrice * product.stock;
        }
        return total;
    }

    public double calculateWarehouseValue(int warehouseId) {
        double total = 0;
        for (Product product : globalInventoryData.products.values()) {
            if (product.warehouseId == warehouseId) {
                total += product.finalPrice * product.stock;
            }
        }
        return total;
    }

    public double calculateCategoryValue(String category) {
        double total = 0;
        for (Product product : globalInventoryData.products.values()) {
            if (product.category.equals(category)) {
                total += product.finalPrice * product.stock;
            }
        }
        return total;
    }

    public int processOrder(ArrayList<Integer> productIds, ArrayList<Integer> quantities, String customerInfo) {
        if (productIds.size() != quantities.size()) {
            return -1;
        }
        Order order = new Order();
        order.items = new ArrayList<>();
        order.totalPrice = 0;
        for (int i = 0; i < productIds.size(); i++) {
            Product product = globalInventoryData.products.get(productIds.get(i));
            int quantity = quantities.get(i);
            
            if (product.stock >= quantity) {
                product.stock -= quantity;
                Order.OrderItem item = order.new OrderItem();
                item.productId = product.id;
                item.quantity = quantity;
                item.price = product.finalPrice * quantity;
                order.totalPrice += item.price;
                order.items.add(item);
            } else {
                System.out.println("Insufficient stock!");
                return -1;
            }
        }

        globalInventoryData.currentOrderId++;
        order.id = globalInventoryData.currentOrderId;
        order.customerInfo = customerInfo;
        order.status = "pending";  
        order.createdAt = new Date().toString();  
        
        globalInventoryData.orders.put(order.id, order);
        totalSales += order.totalPrice;
        
        return order.id;
    }

    
    public String GenerateInventoryReport() {
        StringBuilder report = new StringBuilder();
        report.append("INVENTORY REPORT\n");
        report.append("================\n");
        
        for (Product product : globalInventoryData.products.values()) {
            report.append("Product: " + product.name + "\n");  
            report.append("Stock: " + product.stock + "\n");
            report.append("Value: " + (product.finalPrice * product.stock) + "\n");
            report.append("----------------\n");
        }
        
        return report.toString();
    }

    public String GenerateSalesReport() {
        StringBuilder report = new StringBuilder();
        report.append("SALES REPORT\n");
        report.append("============\n");
        
        for (Order order : globalInventoryData.orders.values()) {
            report.append("Order: " + order.id + "\n");
            report.append("Total: " + order.totalPrice + "\n");
            report.append("----------------\n");
        }
        
        return report.toString();
    }
}