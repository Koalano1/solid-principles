package single_responsibility.incorrect;

public class Board {
    private char[][] grid;

    public Board(int size) {
        grid = new char[size][size];
    }

    public void placeMarker(int row, int col, char marker) {
        grid[row][col] = marker;
    }

    public boolean checkWin() {
        // Kiểm tra hàng, cột, đường chéo để xác định người thắng
        return false;
    }

    public void printBoard() {
        for (char[] row : grid) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}
