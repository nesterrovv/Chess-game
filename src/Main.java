import chessPieces.*;
import gameProcess.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Game starting...");
        Board board = new Board();
        board.makeStartingPosition();
        board.movePiece(1,1,2,1);
        board.printBoard();
    }
}
