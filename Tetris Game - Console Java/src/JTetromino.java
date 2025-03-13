class JTetromino extends Tetromino {
    @Override
    public char[][] initializeShape() {
        shape = new char[][]{
                {' ', '*'},
                {' ', '*'},
                {'*', '*'}
        };
        return shape;
    }
}