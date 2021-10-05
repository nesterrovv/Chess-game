package chessPieces;

import chessPieces.resources.Color;
import chessPieces.resources.Type;

public class Pawn extends ChessPiece {

    private boolean firstMovement = true;

    public Pawn(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
        this.type = Type.PAWN;
    }

    @Override
    public boolean move(int xGoal, int yGoal) {
        if (firstMovement) {
            if ((Math.abs(yGoal - this.y) == 1 || Math.abs(yGoal - this.y) == 2) && xGoal - this.x == 0) {
                this.firstMovement = false;
                this.y = yGoal; // movement
                return true;
            } else return false;
        } else {
            return yGoal - this.y == 1 && xGoal - this.x == 0;
        }
    }

    @Override
    public boolean take(int xGoal, int yGoal) {
        if (xGoal - this.x == 1 && yGoal - this.y == 1) {
            this.x = xGoal;
            this.y = yGoal;
            return true;
        } else return false;
    }
}
