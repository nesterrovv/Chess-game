package chessPieces;

import chessPieces.resources.Color;
import chessPieces.resources.Type;

public class King extends ChessPiece {

    public King(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
        this.type = Type.KING;
    }

    @Override
    public boolean move(int xGoal, int yGoal) {
        if (((xGoal - this.x == yGoal - this.y) && (Math.abs(xGoal - this.x) == 1)) ||
                ((Math.abs(xGoal - this.x) == 1) && (this.y == yGoal)) ||
                (Math.abs(yGoal - this.y) == 1 &&(this.x == xGoal))) {
            this.x = xGoal;
            this.y = yGoal;
            return true;
        } else return false;
    }

}
