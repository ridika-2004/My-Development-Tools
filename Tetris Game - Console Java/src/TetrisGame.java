class TetrisGame {
    private char[][] grid;

    public TetrisGame() {
        grid = new char[20][10];
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 10; j++) {
                grid[i][j] = ' ';
            }
        }
    }

    public void placeTetromino(Tetromino tetromino, int x, int y) {
        char[][] shape = tetromino.getShape();
        int rows = shape.length;
        int cols = shape[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (shape[i][j] == '*') {
                    grid[x + i][y + j] = '*';
                }
            }
        }
    }

    public void printGrid() {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }
    }
}