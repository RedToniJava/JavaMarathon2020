package day17;

public enum ChessPiece {
    KING_WHITE(100, "♔"), KING_BLACK(100, "♚"), QUEEN_WHITE(9, "♕"), QUEEN_BLACK(9, "♛"), ROOK_WHITE(5, "♖"), ROOK_BLACK(5, "♜"), ELEPHANT_WHITE(3.5, "♗"), ELEPHANT_BLACK(3.5, "♝"), HORSE_WHITE(3, "♘"), HORSE_BLACK(3, "♞"), PAWN_WHITE(1, "♙"), PAWN_BLACK(1, "♟"), EMPTY(-1, "_");

    private double price;
    private String symbol;

    ChessPiece(double price, String symbol) {
        this.price = price;
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }
    public String toString(){
        return symbol;
    }


}
