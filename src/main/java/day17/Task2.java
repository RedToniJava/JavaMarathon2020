package day17;

public class Task2 {
    public static void main(String[] args) {
        ChessPiece pawnWhite = ChessPiece.PAWN_WHITE;
        ChessPiece pawnBlack = ChessPiece.PAWN_BLACK;
        ChessPiece rookBlack = ChessPiece.ROOK_BLACK;
        ChessPiece rookWhite = ChessPiece.ROOK_WHITE;
        ChessPiece elephantWhite = ChessPiece.ELEPHANT_WHITE;
        ChessPiece elephantBlack = ChessPiece.ELEPHANT_BLACK;
        ChessPiece horseBlack = ChessPiece.HORSE_BLACK;
        ChessPiece queenWhite = ChessPiece.QUEEN_WHITE;
        ChessPiece queenBlack = ChessPiece.QUEEN_BLACK;
        ChessPiece kingWhite = ChessPiece.KING_WHITE;
        ChessPiece kingBlack = ChessPiece.KING_BLACK;
        ChessPiece empty = ChessPiece.EMPTY;

        String[][] chessBoard = new String[8][8];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (i == 0 && j == 0 || i == 0 && j == 5) chessBoard[i][j] = rookBlack.getSymbol();
                else if (i == 0 && j == 6) chessBoard[i][j] = kingBlack.getSymbol();
                else if (i == 1 && j == 1 || i == 7 && j == 5) chessBoard[i][j] = rookWhite.getSymbol();
                else if (i == 1 && j == 4 || i == 1 && j == 5 || i == 1 && j == 7 || i == 2 && j == 0 || i == 2 && j == 6)
                    chessBoard[i][j] = pawnBlack.getSymbol();
                else if (i == 2 && j == 2) chessBoard[i][j] = horseBlack.getSymbol();
                else if (i == 3 && j == 0) chessBoard[i][j] = queenBlack.getSymbol();
                else if (i == 4 && j == 3) chessBoard[i][j] = elephantBlack.getSymbol();
                else if (i == 4 && j == 4 || i == 5 && j == 5 || i == 6 && j == 0 || i == 6 && j == 5 || i == 6 && j == 7)
                    chessBoard[i][j] = pawnWhite.getSymbol();
                else if (i == 3 && j == 3 || i == 5 && j == 4) chessBoard[i][j] = elephantWhite.getSymbol();
                else if (i == 6 && j == 3) chessBoard[i][j] = queenWhite.getSymbol();
                else if (i == 7 && j == 6) chessBoard[i][j] = kingWhite.getSymbol();
                else chessBoard[i][j] = empty.getSymbol();
            }
        }
        ChessBoard cb = new ChessBoard(chessBoard);
        cb.print();


    }
}
