package day17;

/**
 * * Всего существует 6 различных шахматных фигур: король (англ. king),
 * ферзь (англ. queen), ладья (англ. rook), слон (англ. bishop),
 * конь (англ. knight) и пешка (англ. pawn).
 * <p>
 * В нашем перечислении необходимо создать 12 фигур - 6 белых и 6 черных.
 * Названия фигур в перечислении должны иметь следующий вид:
 * * KING_WHITE, KING_BLACK, QUEEN_WHITE, QUEEN_BLACK, и так далее
 * Ценности шахматных фигур приведены в таблице:
 * * Пешка  1
 * * Конь   3
 * * Слон   3.5
 * * Ладья  5
 * * Ферзь  9
 * * Король 100
 * *
 * * Строковые обозначения шахматных фигур приведены в таблице:
 * * Пешка (белая)  ♙
 * * Конь (белый)   ♘
 * * Слон (белый)   ♗
 * * Ладья (белая)  ♖
 * * Ферзь (белый)  ♕
 * * Король (белый) ♔
 * *
 * *
 * * Пешка (черная)  ♟
 * * Конь (черный)   ♞
 * * Слон (черный)   ♝
 * * Ладья (черная)  ♜
 * * Ферзь (черный)  ♛
 * * Король (черный) ♚
 */
public enum ChessPiece {
    KING_WHITE(100, "♔"), KING_BLACK(100, "♚"),
    QUEEN_WHITE(9, "♕"), QUEEN_BLACK(9, "♛"),
    ROOK_WHITE(5, "♖"), ROCK_BLACK(5, "♜"),
    BISHOP_WHITE(3.5, "♗"), BISHOP_BLACK(3.5, "♝"),
    KNIGHT_WHITE(3, "♘"), KNIGHT_BLACK(3, "♞"),
    PAWN_BLACK(1, "♙"), PAWN_WHITE(1, "♟"),
    EMPTY(-1, "_");

    private double figureValue;
    private String figureDesignation;

    ChessPiece(double figureValue, String figureDesignation) {
        this.figureDesignation = figureDesignation;
        this.figureValue = figureValue;
    }

    public String getFigureDesignation() {
        return figureDesignation;
    }

    @Override
    public String toString() {
        return figureDesignation;
    }
}
