class Rectangle extends Shape {
    private double width, height;

    public Rectangle(int x, int y, double width, double height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return "Rectangle(" + x + ", " + y + ", Area=" + calculateArea() + ")";
    }
}