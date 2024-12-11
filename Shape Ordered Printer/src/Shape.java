
abstract class Shape {
    protected int x, y;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract double calculateArea();

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
