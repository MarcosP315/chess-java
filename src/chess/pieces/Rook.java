package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

/**
 *
 * @author mpbc3
 */
public class Rook extends ChessPiece{
    
    public Rook(Board board, Color color) {
        super(board, color);
    }
    
    @Override
    public String toString(){
        return "R";
    }
}
