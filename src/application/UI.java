package application;

import chess.ChessPiece;
import java.util.Optional;
import java.util.function.Consumer;

/**
 *
 * @author mpbc3
 */
public class UI {
    
    public static void printBoard(ChessPiece[][] pieces){
        for (int i = 0; i < pieces[0].length; i++) {
            System.out.print((8-i) + " ");
            for (int j = 0; j < pieces.length; j++) {
                printPiece(pieces[i][j]);
            }
            System.out.println();
        }
        System.out.println("  a b c d e f g h");
    }
    
    private static void printPiece(ChessPiece piece){
        Optional.ofNullable(piece).ifPresentOrElse(
                //Se a peça não for nula, imprime-a.
                (ChessPiece p) -> System.out.print(p),
                //Caso contrário, imprime "-".
                () -> System.out.print("-"));
        System.out.print(" ");
    }
}
