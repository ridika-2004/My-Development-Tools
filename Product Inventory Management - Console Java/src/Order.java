import java.util.List;

public class Order {
    private String orderId;
    private List<Product> products;
    private String status;
    private double totalPrice;

    public void processOrder() {}
    public String generateInvoice() { return null; }
}