package src;
enum ServeType {
    PAPER_CUP(0), WAFFLE_CONE(5.00);

    private final double price;

    ServeType(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}