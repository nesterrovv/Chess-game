package gameProcess;

import chessPieces.*;
import chessPieces.resources.Color;

public class Board {

    /** Two-dimensional array for keeping info about cells condition */
    private ChessPiece[][] board = new ChessPiece[8][8];
    private ChessPiece[] whiteTeam = new ChessPiece[16];
    private ChessPiece[] blackTeam = new ChessPiece[16];

    public void makeStartingPosition() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = null; // "cleaning" the board
            }
        }
        board[0][0] = new Rook(0, 0, Color.WHITE);
        board[0][7] = new Rook(0, 7, Color.WHITE);
        board[0][1] = new Horse(0, 1, Color.WHITE);
        board[0][6] = new Horse(0, 6, Color.WHITE);
        board[0][2] = new Elephant(0, 2, Color.WHITE);
        board[0][5] = new Elephant(0, 5, Color.WHITE);
        board[0][3] = new Queen(0, 3, Color.WHITE);
        board[0][4] = new King(0, 4, Color.WHITE);
        board[1][0] = new Pawn(1, 0, Color.WHITE);
        board[1][1] = new Pawn(1, 1, Color.WHITE);
        board[1][2] = new Pawn(1, 2, Color.WHITE);
        board[1][3] = new Pawn(1, 3, Color.WHITE);
        board[1][4] = new Pawn(1, 4, Color.WHITE);
        board[1][5] = new Pawn(1, 5, Color.WHITE);
        board[1][6] = new Pawn(1, 6, Color.WHITE);
        board[1][7] = new Pawn(1, 7, Color.WHITE);
        board[7][0] = new Rook(0, 0, Color.BLACK);
        board[7][7] = new Rook(0, 7, Color.BLACK);
        board[7][1] = new Horse(0, 1, Color.BLACK);
        board[7][6] = new Horse(0, 6, Color.BLACK);
        board[7][2] = new Elephant(0, 2, Color.BLACK);
        board[7][5] = new Elephant(0, 5, Color.BLACK);
        board[7][3] = new Queen(0, 3, Color.BLACK);
        board[7][4] = new King(0, 4, Color.BLACK);
        board[6][0] = new Pawn(1, 0, Color.BLACK);
        board[6][1] = new Pawn(1, 1, Color.BLACK);
        board[6][2] = new Pawn(1, 2, Color.BLACK);
        board[6][3] = new Pawn(1, 3, Color.BLACK);
        board[6][4] = new Pawn(1, 4, Color.BLACK);
        board[6][5] = new Pawn(1, 5, Color.BLACK);
        board[6][6] = new Pawn(1, 6, Color.BLACK);
        board[6][7] = new Pawn(1, 7, Color.BLACK);
        // ADD HERE FILLING ARRAYS WITH PIECES OF BOTH COMMANDS
    }

    public boolean movePiece(int xInit, int yInit, int xGoal, int yGoal) {
        ChessPiece piece = board[xInit][yInit];
        if (piece.move(xGoal, yGoal)) {
            board[xGoal][yGoal] = piece;
            board[xInit][yInit] = null;
            return true;
        } else return false;
    }

    public boolean takePiece(int xInit, int yInit, int xGoal, int yGoal) {
        ChessPiece piece = board[xInit][yInit];
        if (piece.take(xGoal, yGoal)) {
            board[xGoal][yGoal] = null;
            // ADD HERE LOGIC FOR REMOVING PIECE FROM GAME
            board[xGoal][yGoal] = piece;
            return true;
        } else return false;
    }

    public boolean removePiece() {}

}
