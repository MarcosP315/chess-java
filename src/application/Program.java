package application;

import chess.ChessException;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author mpbc3
 */
public class Program {

    public static void main(String[] args) {
        ChessMatch chessMatch = new ChessMatch();
        Scanner sc = new Scanner(System.in); 
        while (true) {
            try {
//                sc = new Scanner(System.in);
                UI.clearScreen();
                UI.printMatch(chessMatch);
                System.out.println();
                System.out.print("Source: ");
                ChessPosition source = UI.readChessPosition(sc);

                boolean[][] possibleMoves = chessMatch.possibleMoves(source);
                UI.clearScreen();
                UI.printBoard(chessMatch.getPieces(), possibleMoves);

                System.out.println();
                System.out.print("Target: ");
                ChessPosition target = UI.readChessPosition(sc);

                ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
            } catch (ChessException | InputMismatchException ex) {
                System.out.println(ex.getMessage());
//                sc = new Scanner(System.in);
                sc.nextLine();
            }
        }
    }

}
