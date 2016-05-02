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
    public static Piece queen()
    {
        List<Direction> moves = Moves.diagonals();
        moves.addAll(Moves.cardinals());
        return new Piece(moves);
    }
    public static Piece rook()
    {
        return new Piece(Moves.cardinals());
    }
    public static Piece bishop()
    {
        return new Piece(Moves.diagonals());
    }
    public static Piece knight()
    {
        return new Piece(Moves.knight(3));
    }
    public static Piece pawn(int boardSize)
    {
        List<Direction> moves = new ArrayList<Direction>();
        moves.add(new Direction(0, 1));
        List<Direction> captures = new ArrayList<Direction>();
        captures.add(new Direction(1, 1));
        captures.add(new Direction(1, -1));
        return new Piece(moves, captures);
    }

}
