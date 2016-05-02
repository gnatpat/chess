package net.natpat;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by np1213 on 23/04/16.
 */
public class Pieces {


    public static Piece king()
    {
        return new Piece(Moves.around());
    }
    public static Piece queen(int boardSize)
    {
        List<Offset> moves = Moves.diagonals(boardSize);
        moves.addAll(Moves.cardinals(boardSize));
        return new Piece(moves);
    }
    public static Piece rook(int boardSize)
    {
        return new Piece(Moves.cardinals(boardSize));
    }
    public static Piece bishop(int boardSize)
    {
        return new Piece(Moves.diagonals(boardSize));
    }
    public static Piece knight()
    {
        return new Piece(Moves.knight(3));
    }
    public static Piece pawn(int boardSize)
    {
        List<Offset> moves = new ArrayList<Offset>();
        moves.add(new Offset(0, 1));
        List<Offset> captures = new ArrayList<Offset>();
        captures.add(new Offset(1, 1));
        captures.add(new Offset(1, -1));
        return new Piece(moves, captures);
    }

}
