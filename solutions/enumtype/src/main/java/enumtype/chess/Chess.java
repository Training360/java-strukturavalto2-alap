package enumtype.chess;

public enum Chess {

    KING(1), QUEEN(1), CASTLE(2), BISHOP(2), KNIGHT(2), PAWN(8);

    private int pieces;

    Chess(int pieces) {
        this.pieces = pieces;
    }

    public int getPieces() {
        return pieces;
    }
}
