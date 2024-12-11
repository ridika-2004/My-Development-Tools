package src;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class InvoiceGenerator {
    private static double taxMultiplier = 0.08;
    public void generateInvoice(Order order) throws IOException {
        try (FileWriter writer = new FileWriter("invoice.txt")) {
            writer.write("Ice Cream Shop Invoice\n");

            writeFlavorsToInvoice(order, writer);
            writeToppingsToInvoice(order, writer);

            writer.write("Subtotal: $" + String.format("%.2f", order.calculateSubtotal()) + "\n");
            writer.write("Tax: $" + String.format("%.2f", order.calculateSubtotal() * taxMultiplier) + "\n");
            writer.write("Total Amount Due: $" + String.format("%.2f", order.calculateTotalWithTax()) + "\n");
        }
    }

    private void writeFlavorsToInvoice(Order order, FileWriter writer) throws IOException {
        List<IceCreamFlavor> processedFlavors = new ArrayList<>();
        for (IceCreamFlavor flavor : order.getFlavors()) {
            if (!processedFlavors.contains(flavor)) {
                int count = 0;
                for (IceCreamFlavor f : order.getFlavors()) {
                    if (f.equals(flavor)) {
                        count++;
                    }
                }
                writer.write(flavor.getName() + " - " + count + " scoop: $" +
                        String.format("%.2f", flavor.getPricePerScoop() * count) + "\n");
                processedFlavors.add(flavor);
            }
        }
    }


    private void writeToppingsToInvoice(Order order, FileWriter writer) throws IOException {
        List<Topping> processedToppings = new ArrayList<>();
        for (Topping topping : order.getToppings()) {
            if (!processedToppings.contains(topping)) {
                int count = 0;
                for (Topping t : order.getToppings()) {
                    if (t.equals(topping)) {
                        count++;
                    }
                }
                writer.write(topping.getName() + " - " + count + " time: $" +
                        String.format("%.2f", topping.getPrice() * count) + "\n");
                processedToppings.add(topping);
            }
        }
    }


}