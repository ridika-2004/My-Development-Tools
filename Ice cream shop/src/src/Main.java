package src;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        IceCreamFlavor mintChocChip = new IceCreamFlavor("Mint Chocolate Chip", 2.80);
        IceCreamFlavor chocFudge = new IceCreamFlavor("Chocolate Fudge", 3.00);


        Topping freshStrawberries = new Topping("Fresh Strawberries", 0.50);
        Topping chocChips = new Topping("Chocolate Chips", 0.50);


        Order order = new Order();
        order.addFlavor(chocFudge, 1);
        order.addFlavor(mintChocChip, 1);
        order.addTopping(chocChips, 1);
        order.addTopping(freshStrawberries, 2);
        order.setServeType(ServeType.PAPER_CUP);

        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        invoiceGenerator.generateInvoice(order);

        System.out.println("See the text file");
    }
}
