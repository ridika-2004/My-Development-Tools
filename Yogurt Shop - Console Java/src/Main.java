import java.io.IOException;
import java.util.Scanner;

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


        Topping topping1 = new Topping();
        topping1.setName("Sprinkles");
        topping1.setPrice(0.30);

        Topping topping2 = new Topping();
        topping2.setName("Mixed chopped nuts");
        topping2.setPrice(0.75);

        Topping topping3 = new Topping();
        topping3.setName("Crushed Gingerbread");
        topping3.setPrice(0.75);

        Topping topping4 = new Topping();
        topping4.setName("Fresh Strawberries");
        topping4.setPrice(1.00);



        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        try {
            invoiceGenerator.generateInvoice(order);
            System.out.println("Invoice generated successfully.");
        } catch (IOException e) {
            System.out.println("Error generating invoice: " + e.getMessage());
        }

    }
}