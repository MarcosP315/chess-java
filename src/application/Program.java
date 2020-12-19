package application;

import chess.ChessException;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

/**
 *
 * @author mpbc3
 */
public class Program {

    public static void main(String[] args) {
        ChessMatch chessMatch = new ChessMatch();
        Scanner sc = new Scanner(System.in); 
        List<ChessPiece> captured = new ArrayList();
        
        while (!chessMatch.getCheckMate()) {
            try {
//                sc = new Scanner(System.in);
                UI.clearScreen();
                UI.printMatch(chessMatch, captured);
                System.out.println();
                System.out.print("Source: ");
                ChessPosition source = UI.readChessPosition(sc);

                boolean[][] possibleMoves = chessMatch.possibleMoves(source);
                UI.clearScreen();
                UI.printBoard(chessMatch.getPieces(), possibleMoves);

                System.out.println();
                System.out.print("Target: ");
                ChessPosition target = UI.readChessPosition(sc);

                Optional.ofNullable(chessMatch.performChessMove(source, target)).ifPresent(p -> captured.add(p));
                
                if (chessMatch.getPromoted() != null) {
                    System.out.print("Digite a peça para promoção (B, N, R ou Q): ");
                    chessMatch.replacePromotedPiece(sc.nextLine());
                }
                
            } catch (ChessException | InputMismatchException ex) {
                System.out.println(ex.getMessage());
                sc.nextLine();
            }
        }
        
        UI.clearScreen();
        UI.printMatch(chessMatch, captured);
    }

}
