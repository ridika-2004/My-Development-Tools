public abstract class DiscountStrategy {
    protected double discountRate;

    public abstract double applyDiscount(double basePrice);
}
