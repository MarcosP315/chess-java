package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

/**
 *
 * @author mpbc3
 */
public class Rook extends ChessPiece{
    
    public Rook(Color color, Board board) {
        super(color, board);
    }
    
    @Override
    public String toString(){
        return "R";
    }
}
