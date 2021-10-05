package chessPieces;

import chessPieces.resources.Color;
import chessPieces.resources.Type;

public class Horse extends ChessPiece {

    public Horse(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
        this.type = Type.ELEPHANT;
    }

    @Override
    public boolean move(int xGoal, int yGoal) {
        if (((Math.abs(xGoal - this.x) == 2) && (Math.abs(yGoal - this.y) == 1)) ||
                ((Math.abs(xGoal - this.x) == 1) && (Math.abs(yGoal - this.y) == 2))) {
            this.x = xGoal;
            this.y = yGoal;
            return true;
        } else return false;
    }

}
