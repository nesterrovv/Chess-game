package chessPieces;

import chessPieces.resources.Color;
import chessPieces.resources.Type;

public class Queen extends ChessPiece {

    public Queen(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
        this.type = Type.QUEEN;
    }

    @Override
    public boolean move(int xGoal, int yGoal) {
        if (((xGoal - this.x == yGoal - this.y) ||  (this.x != xGoal) && (this.y == yGoal)) ||
                (this.y != yGoal &&(this.x == xGoal))) {
            this.x = xGoal;
            this.y = yGoal;
            return true;
        } else return false;
    }
}
