import java.util.Arrays;

abstract class Tetromino {
    protected char[][] shape;

    public abstract char[][] initializeShape();

    public char[][] rotate() {
        shape = initializeShape();
        int rows = shape.length;
        int cols = shape[0].length;
        char[][] rotatedShape = new char[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                rotatedShape[j][rows - 1 - i] = shape[i][j];
            }
        }
        return rotatedShape;
    }

    public char[][] getShape() {
        return initializeShape();
    }
}