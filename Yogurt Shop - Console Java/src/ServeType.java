enum ServeType {
    PAPER_CUP(0), GLASS_JAR(5.00);

    private final double price;

    ServeType(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}