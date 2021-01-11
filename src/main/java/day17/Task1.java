package day17;

public class Task1 {
    public static void main(String[] args) {
        ChessPiece pawnWhite = ChessPiece.PAWN_WHITE;
        ChessPiece rookBlack = ChessPiece.ROOK_BLACK;

        String[] piece = new String[8];
        for (int i = 0; i < 8; i++) {
            if (i < 4) piece[i] = pawnWhite.getSymbol();
            if (i > 3) piece[i] = rookBlack.getSymbol();
            System.out.print(piece[i] + " ");

        }

    }
}