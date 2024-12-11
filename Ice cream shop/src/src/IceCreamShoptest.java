package src;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.File;
import java.io.IOException;

class IceCreamShopTest {

    @Test
    void test1() {
        Order order = new Order();
        IceCreamFlavor mintChocChip = new IceCreamFlavor("Mint Chocolate Chip", 2.80);
        IceCreamFlavor chocFudge = new IceCreamFlavor("Chocolate Fudge", 3.00);

        order.addFlavor(mintChocChip, 2);
        order.addFlavor(chocFudge, 1);

        double expectedSubtotal = (2 * 2.80) + (1 * 3.00);
        assertEquals(expectedSubtotal, order.calculateSubtotal(), 0.01);
    }

    @Test
    void test2() {
        Order order = new Order();
        Topping sprinkles = new Topping("Sprinkles", 0.30);
        Topping chocChips = new Topping("Chocolate Chips", 0.50);

        order.addTopping(sprinkles, 3);
        order.addTopping(chocChips, 2);

        double expectedSubtotal = (3 * 0.30) + (2 * 0.50);
        assertEquals(expectedSubtotal, order.calculateSubtotal(), 0.01);
    }

    @Test
    void test3() {
        Order order = new Order();
        order.setServeType(ServeType.WAFFLE_CONE);

        double expectedSubtotal = 5.00;
        assertEquals(expectedSubtotal, order.calculateSubtotal(), 0.01);
    }

    @Test
    void test4() {
        Order order = new Order();
        IceCreamFlavor strawberrySwirl = new IceCreamFlavor("Strawberry Swirl", 2.75);
        Topping freshStrawberries = new Topping("Fresh Strawberries", 1.00);

        order.addFlavor(strawberrySwirl, 2);
        order.addTopping(freshStrawberries, 1);
        order.setServeType(ServeType.PAPER_CUP);

        double expectedSubtotal = (2 * 2.75) + (1 * 1.00);
        double expectedTotalWithTax = expectedSubtotal * 1.08;
        assertEquals(expectedTotalWithTax, order.calculateTotalWithTax(), 0.01);
    }

    @Test
    void test5() throws IOException {
        Order order = new Order();
        IceCreamFlavor chocFudge = new IceCreamFlavor("Chocolate Fudge", 3.00);
        Topping oreo = new Topping("Crushed Oreo", 0.85);

        order.addFlavor(chocFudge, 1);
        order.addTopping(oreo, 1);
        order.setServeType(ServeType.WAFFLE_CONE);

        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        invoiceGenerator.generateInvoice(order);

        File invoiceFile = new File("invoice.txt");
        assertTrue(invoiceFile.exists());
        assertTrue(invoiceFile.length() > 0);
    }
}
