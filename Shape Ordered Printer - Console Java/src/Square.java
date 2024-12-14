class Square extends Shape {
    private double side;

    public Square(int x, int y, double side) {
        super(x, y);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return "Square(" + x + ", " + y + ", Area=" + calculateArea() + ")";
    }
}
