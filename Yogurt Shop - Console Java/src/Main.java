import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();

        YogurtFlavor flavor1 = new YogurtFlavor();
        flavor1.setName("Cookies and Cream");
        flavor1.setPricePerScoop(2.80);

        YogurtFlavor flavor2 = new YogurtFlavor();
        flavor2.setName("Chocolate Fudge");
        flavor2.setPricePerScoop(3.00);

        YogurtFlavor flavor3 = new YogurtFlavor();
        flavor3.setName("Pistachio Delight");
        flavor3.setPricePerScoop(3.25);

        order.addFlavor(flavor1,3);
        order.addFlavor(flavor2,1);
        order.addFlavor(flavor3,2);

        Topping topping1 = new Topping();
        topping1.setName("Sprinkles");
        topping1.setPrice(0.30);

        Topping topping2 = new Topping();
        topping2.setName("Mixed chopped nuts");
        topping2.setPrice(0.75);

        Topping topping3 = new Topping();
        topping3.setName("Crushed Gingerbread");
        topping3.setPrice(0.75);

        order.addTopping(topping1,3);
        order.addTopping(topping2,1);
        order.addTopping(topping3,2);

        order.setServeType(ServeType.GLASS_JAR);

        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        try {
            invoiceGenerator.generateInvoice(order);
            System.out.println("Invoice generated successfully.");
        } catch (IOException e) {
            System.out.println("Error generating invoice: " + e.getMessage());
        }

    }
}