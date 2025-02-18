package single_responsibility;

import single_responsibility.correct.BoardPresenter;
import single_responsibility.correct.BoardShaper;
import single_responsibility.correct.Board;

public class Main {
    public static void main(String[] args) {
        Board board = new Board(3); // Creates a 3x3 board
        BoardShaper shaper = new BoardShaper(3);
        BoardPresenter presenter = new BoardPresenter(board);

        presenter.displayBoard();
    }
}