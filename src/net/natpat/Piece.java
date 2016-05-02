package net.natpat;

import java.util.List;

/**
 * Created by np1213 on 23/04/16.
 */
public class Piece {

    private final List<Direction> moves;
    private final List<Direction> captureMoves;

    public Piece(List<Direction> moves)
    {
        this(moves, moves);
    }
    public Piece(List<Direction> moves, List<Direction> captureMoves)
    {
        this.moves = moves;
        this.captureMoves = captureMoves;
    }

    public List<Direction> getMoves()
    {
        return moves;
    }

    public List<Direction> getCaptureMoves()
    {
        return captureMoves;
    }
}
