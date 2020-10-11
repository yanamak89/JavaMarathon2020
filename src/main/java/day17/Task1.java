package day17;

import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

import static day17.ChessPiece.PAWN_WHITE;
import static day17.ChessPiece.ROCK_BLACK;

/**
 * 1. Создайте Enum “Шахматная фигура” (англ. ChessPiece).
 * Всего существует 6 различных шахматных фигур: король (англ. king), ферзь (англ. queen), ладья (англ. rook), слон (англ. bishop), конь (англ. knight) и пешка (англ. pawn).
 * <p>
 * В нашей программе, у каждой шахматной фигуры есть следующие характеристики:
 * Ценность фигуры - вещественное число
 * Строковое обозначение фигуры
 * <p>
 * В нашем перечислении необходимо создать 12 фигур - 6 белых и 6 черных. Названия фигур в перечислении должны иметь следующий вид:
 * KING_WHITE, KING_BLACK, QUEEN_WHITE, QUEEN_BLACK, и так далее
 * <p>
 * У каждой фигуры должны быть заданы две характеристики - ее ценность и строковое обозначение.
 * <p>
 * Ценности шахматных фигур приведены в таблице:
 * Пешка  1
 * Конь   3
 * Слон   3.5
 * Ладья  5
 * Ферзь  9
 * Король 100
 * <p>
 * Строковые обозначения шахматных фигур приведены в таблице:
 * Пешка (белая)  ♙
 * Конь (белый)   ♘
 * Слон (белый)   ♗
 * Ладья (белая)  ♖
 * Ферзь (белый)  ♕
 * Король (белый) ♔
 * <p>
 * <p>
 * Пешка (черная)  ♟
 * Конь (черный)   ♞
 * Слон (черный)   ♝
 * Ладья (черная)  ♜
 * Ферзь (черный)  ♛
 * Король (черный) ♚
 * <p>
 * <p>
 * Используя созданный enum, в методе main() класса Task1 создайте массив, содержащий 4 белых пешки и 4 черных ладьи.
 * Выведите содержимое этого массива на экран, используя строковые обозначения шахматных фигур.
 * <p>
 * Вывод в консоль должен быть таким:
 * ♙ ♙ ♙ ♙ ♜ ♜ ♜ ♜
 */
public class Task1 {

    public static void main(String[] args) {
        ChessPiece[] whiteArrayChess = {
                ChessPiece.PAWN_WHITE, ChessPiece.PAWN_WHITE, ChessPiece.PAWN_WHITE,
                ChessPiece.PAWN_WHITE, ChessPiece.ROCK_BLACK, ChessPiece.ROCK_BLACK,
                ChessPiece.ROCK_BLACK, ChessPiece.ROCK_BLACK};

        for (ChessPiece chessPiece : whiteArrayChess){
            System.out.print(chessPiece.getFigureDesignation() + " ");
        }

    }
}
