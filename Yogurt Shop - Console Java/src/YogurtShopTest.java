import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.File;
import java.io.IOException;

public class YogurtShopTest {

    @Test
    void test1() {
        Order order = new Order();
        YogurtFlavor yogurtFlavor1 = new YogurtFlavor();
        yogurtFlavor1.setName("Cookies and Cream");
        yogurtFlavor1.setPricePerScoop(2.80);

        YogurtFlavor yogurtFlavor2 = new YogurtFlavor();
        yogurtFlavor2.setName("Chocolate Fudge");
        yogurtFlavor2.setPricePerScoop(3.00);

        order.addFlavor(yogurtFlavor1, 2);
        order.addFlavor(yogurtFlavor2, 1);

        double expectedSubtotal = (2 * 2.80) + (1 * 3.00);
        assertEquals(expectedSubtotal, order.calculateSubtotal(), 0.01);
    }

    @Test
    void test2() {
        Order order = new Order();
        Topping topping1 = new Topping();
        topping1.setName("Sprinkles");
        topping1.setPrice(0.30);

        Topping topping2 = new Topping();
        topping2.setName("Mixed chopped nuts");
        topping2.setPrice(0.75);

        order.addTopping(topping1, 3);
        order.addTopping(topping2, 2);

        double expectedSubtotal = (3 * 0.30) + (2 * 0.75);
        assertEquals(expectedSubtotal, order.calculateSubtotal(), 0.01);
    }

    @Test
    void test3() {
        Order order = new Order();
        order.setServeType(ServeType.GLASS_JAR);

        double expectedSubtotal = 5.00;
        assertEquals(expectedSubtotal, order.calculateSubtotal(), 0.01);
    }

    @Test
    void test4() {
        Order order = new Order();

        YogurtFlavor yogurtFlavor = new YogurtFlavor();
        yogurtFlavor.setName("Cookies and Cream");
        yogurtFlavor.setPricePerScoop(2.80);

        Topping topping = new Topping();
        topping.setName("Mixed chopped nuts");
        topping.setPrice(0.75);

        order.addFlavor(yogurtFlavor, 2);
        order.addTopping(topping, 1);
        order.setServeType(ServeType.PAPER_CUP);

        double expectedSubtotal = (2 * 2.80) + (1 * 0.75);
        double expectedTotalWithTax = expectedSubtotal * 1.08;
        assertEquals(expectedTotalWithTax, order.calculateTotalWithTax(), 0.01);
    }

    @Test
    void test5() throws IOException {
        Order order = new Order();
        YogurtFlavor yogurtFlavor = new YogurtFlavor();

        yogurtFlavor.setName("Cookies and Cream");
        yogurtFlavor.setPricePerScoop(2.80);

        Topping topping = new Topping();
        topping.setName("Mixed chopped nuts");
        topping.setPrice(0.75);

        order.addFlavor(yogurtFlavor, 1);
        order.addTopping(topping, 1);
        order.setServeType(ServeType.GLASS_JAR);

        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        invoiceGenerator.generateInvoice(order);

        File invoiceFile = new File("invoice.txt");
        assertTrue(invoiceFile.exists());
        assertTrue(invoiceFile.length() > 0);
    }
}
