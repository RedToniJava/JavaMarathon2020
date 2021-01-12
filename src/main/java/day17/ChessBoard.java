package day17;

public class ChessBoard {
    ChessPiece[][] board;

    public ChessBoard(ChessPiece[][] board) {
        this.board = board;

    }

    public void print() {
        for (int i = 0; i < board.length; i++) {
            if (i != 0)
                System.out.println();

            for (int j = 0; j < 8; j++) {
                System.out.print(board[i][j].toString());

            }
        }
    }
}
