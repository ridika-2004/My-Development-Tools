package src;

class IceCreamFlavor {
    private final String name;
    private final double pricePerScoop;

    public IceCreamFlavor(String name, double pricePerScoop) {
        this.name = name;
        this.pricePerScoop = pricePerScoop;
    }

    public String getName() {
        return name;
    }

    public double getPricePerScoop() {
        return pricePerScoop;
    }
}
