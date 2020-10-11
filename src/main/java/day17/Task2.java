package day17;

/**
 * 2. Добавьте новую “фигуру” в enum ChessPiece, которая будет называться EMPTY.
 * Эта “фигура” будет обозначать пустое пространство на шахматной доске.
 * Ценность этой фигуры равна -1, а строковое обозначение равно нижнему подчеркиванию("_").
 * Затем создайте класс Шахматная доска (англ. ChessBoard). Этот класс в
 * единственном аргументе конструктора должен принимать на вход двумерный
 * массив шахматных фигур. Этот двумерный массив задает конфигурацию фигур
 * на шахматной доске. Пустое пространство на шахматной доске задается с
 * помощью значения EMPTY. Также, у класса ChessBoard должен быть реализован
 * метод print(), который выводит шахматную доску в консоль.
 * В методе main() класса Task2 создайте новый объект класса ChessBoard,
 * передав ему в качестве аргумента двумерный массив с расположением фигур
 * как на картинке ниже (матч Крамник - Каспаров 2000 года).
 * Затем, используя метод print() выведите шахматную доску в консоль, используя
 * строковые обозначения шахматных фигур.
 * Вывод в консоль должен быть таким:
 * * Всего существует 6 различных шахматных фигур: король (англ. king),
 * *  ферзь (англ. queen), ладья (англ. rook), слон (англ. bishop),
 * *  конь (англ. knight) и пешка (англ. pawn).
 * *  * Пешка (белая) (англ. pawn) ♙
 * *  * Конь (белый) (англ. knight)  ♘
 * *  * Слон (белый) (англ. bishop) ♗
 * *  * Ладья (белая) (англ. rook) ♖
 * *  * Ферзь (белый) (англ. queen) ♕
 * *  * Король (англ. king) (белый) ♔
 * *  *
 * *  *
 * *  * Пешка (черная) (англ. pawn) ♟
 * *  * Конь (черный) (англ. knight) ♞
 * *  * Слон (черный) (англ. bishop) ♝
 * *  * Ладья (черная) (англ. rook) ♜
 * *  * Ферзь (черный) (англ. queen) ♛
 * *  * Король (черный) (англ. king) ♚
 * <p>
 * ♜____♜♚_
 * _♖__♟♟_♟
 * ♟_♞___♟_
 * ♛__♗____
 * ___♝♙___
 * ____♗♙__
 * ♙__♕_♙_♙
 * _____♖♔_
 */
public class Task2 {
    public static void main(String[] args) {
        ChessBoard chessBoard = new ChessBoard(new ChessPiece[][]{
            {ChessPiece.ROCK_BLACK, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.KING_BLACK, ChessPiece.ROCK_BLACK, ChessPiece.EMPTY},
                {ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.PAWN_BLACK, ChessPiece.PAWN_BLACK, ChessPiece.PAWN_BLACK, ChessPiece.ROCK_BLACK},
                {ChessPiece.PAWN_BLACK, ChessPiece.EMPTY, ChessPiece.KNIGHT_BLACK, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.PAWN_BLACK, ChessPiece.EMPTY},
                {ChessPiece.QUEEN_BLACK, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.BISHOP_WHITE, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY},
                {ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.BISHOP_BLACK, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY},
                {ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.BISHOP_BLACK, ChessPiece.PAWN_WHITE, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY},
                {ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY,ChessPiece.EMPTY, ChessPiece.BISHOP_WHITE,ChessPiece.PAWN_WHITE, ChessPiece.EMPTY, ChessPiece.EMPTY},
                {ChessPiece.PAWN_WHITE, ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.QUEEN_WHITE, ChessPiece.EMPTY, ChessPiece.PAWN_WHITE, ChessPiece.EMPTY,ChessPiece.PAWN_WHITE},
                {ChessPiece.EMPTY,ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY,ChessPiece.EMPTY, ChessPiece.ROOK_WHITE, ChessPiece.KING_WHITE, ChessPiece.EMPTY}

        });

        chessBoard.print();

    }
}
