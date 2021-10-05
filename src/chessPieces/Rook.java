package chessPieces;

import chessPieces.resources.Color;
import chessPieces.resources.Type;

public class Rook extends ChessPiece {

    public Rook(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
        this.type = Type.ROOK;
    }

    @Override
    public boolean move(int xGoal, int yGoal) {
        if (xGoal - this.x == 0 ^ yGoal - this.y == 0) { // XOR condition
            this.x = xGoal;
            this.y = yGoal;
            return true;
        } else return false;
    }

    @Override
    public boolean take(int xGoal, int yGoal) {
        return move(xGoal, yGoal); // because taking pieces using rook is equal movement to the cell
    }

}
