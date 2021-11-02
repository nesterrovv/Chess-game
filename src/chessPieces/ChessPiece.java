package chessPieces;

import chessPieces.resources.Color;
import chessPieces.resources.Type;

public abstract class ChessPiece {

    protected int x;
    protected int y;
    protected Color color;
    protected Type type;
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public boolean move(int xGoal, int yGoal) {
        return true; // if movement is available, otherwise - false
    }

    public boolean take(int xGoal, int yGoal) {
        return this.move(xGoal, yGoal); // because taking pieces using (not pawn) piece is equal movement to this cell
    }

    public boolean isAlive() {
        return true; // if piece is available, otherwise - false
    }

    @Override
    public String toString() {
        return "ChessPiece{" +
                "x=" + x +
                ", y=" + y +
                ", color=" + color +
                ", type=" + type +
                '}';
    }

    public String print(){
        String colorMarker;
        if (this.color.equals(Color.BLACK)) {
            colorMarker = ANSI_BLACK;
        } else colorMarker = ANSI_WHITE;
        String answer = colorMarker + type.toString() + ANSI_RESET;
        return answer;
    }
}
