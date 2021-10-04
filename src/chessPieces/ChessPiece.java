package chessPieces;

import chessPieces.resources.Color;
import chessPieces.resources.Type;

public abstract class ChessPiece {

    private int x;
    private int y;
    private Color color;
    private Type type;

    public boolean move() {
        return true; // if movement is available, otherwise - false
    }

    public boolean take() {
        return true; // if taking is available, otherwise - false
    }

    public boolean isAlive() {
        return true; // if piece is available, otherwise - false
    }


}
