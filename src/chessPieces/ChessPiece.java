package chessPieces;

import chessPieces.resources.Color;
import chessPieces.resources.Type;

public abstract class ChessPiece {

    protected int x;
    protected int y;
    protected Color color;
    protected Type type;

    public boolean move(int xGoal, int yGoal) {
        return true; // if movement is available, otherwise - false
    }

    public boolean take(int xGoal, int yGoal) {
        return true; // if taking is available, otherwise - false
    }

    public boolean isAlive() {
        return true; // if piece is available, otherwise - false
    }


}
