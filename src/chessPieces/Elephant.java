package chessPieces;

import chessPieces.resources.Color;
import chessPieces.resources.Type;

public class Elephant extends ChessPiece {

    public Elephant(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
        this.type = Type.ELEPHANT;
    }

    @Override
    public boolean move(int xGoal, int yGoal) {
        if ((xGoal - this.x == yGoal - this.y) && (xGoal - this.x != 0)) {
            this.x = xGoal;
            this.y = yGoal;
            return true;
        } else return false;
    }

}
