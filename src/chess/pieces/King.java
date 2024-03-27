package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece {
    public King(Position position, Board board, Color color) {
        super(position, board, color);
    }

    @Override
    public String toString() {
        return "K";
    }
}
