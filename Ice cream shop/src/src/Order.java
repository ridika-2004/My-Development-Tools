package src;

import java.util.ArrayList;
import java.util.List;

class Order {
    private static double tax = 1.08;

    private List<IceCreamFlavor> flavors = new ArrayList<>();
    private List<Topping> toppings = new ArrayList<>();
    private ServeType serveType;

    public void addFlavor(IceCreamFlavor flavor, int scoops) {
        for (int i = 0; i < scoops; i++) {
            flavors.add(flavor);
        }
    }

    public void addTopping(Topping topping, int quantity) {
        for (int i = 0; i < quantity; i++) {
            toppings.add(topping);
        }
    }

    public void setServeType(ServeType serveType) {
        this.serveType = serveType;
    }

    public double calculateSubtotal() {
        double subtotal = 0;
        for (IceCreamFlavor flavor : flavors) {
            subtotal += flavor.getPricePerScoop();
        }
        for (Topping topping : toppings) {
            subtotal += topping.getPrice();
        }
        if (serveType != null) {
            subtotal += serveType.getPrice();
        }
        return subtotal;
    }


    public double calculateTotalWithTax() {
        return calculateSubtotal() * tax;
    }

    public List<IceCreamFlavor> getFlavors() {
        return flavors;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public ServeType getServeType() {
        return serveType;
    }
}