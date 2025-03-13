import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TetrisGame game = new TetrisGame();

        while (true) {
            System.out.print("Block: ");
            String blockType = scanner.next();
            if (blockType.equals("-")) {
                game.printGrid();
                break;
            }

            if (blockType.equals("L")) {
                Tetromino lTetromino = new LTetromino();
                rotationInput(lTetromino, scanner);
                placeInput(lTetromino, scanner, game);
            }

            if (blockType.equals("O")) {
                Tetromino oTetromino = new OTetromino();
                rotationInput(oTetromino, scanner);
                placeInput(oTetromino, scanner, game);
            }

            if (blockType.equals("I")) {
                Tetromino iTetromino = new ITetromino();
                rotationInput(iTetromino, scanner);
                placeInput(iTetromino, scanner, game);
            }

            if (blockType.equals("J")) {
                Tetromino jTetromino = new JTetromino();
                rotationInput(jTetromino, scanner);
                placeInput(jTetromino, scanner, game);
            }

            if (blockType.equals("T")) {
                Tetromino tTetromino = new TTetromino();
                rotationInput(tTetromino,scanner);
                placeInput(tTetromino, scanner, game);
            }
        }
        scanner.close();
    }

    public static void rotationInput(Tetromino tetromino, Scanner scanner){
        System.out.print("Rotation: ");
        int rotations = scanner.nextInt();
        for (int i = 0; i < rotations; i++) {
            char[][] result = tetromino.rotate();
        }
    }

    public static void placeInput(Tetromino tetromino, Scanner scanner, TetrisGame game){
        System.out.print("Place: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        game.placeTetromino(tetromino, x, y);
    }
}

