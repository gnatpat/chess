package net.natpat;

import java.util.List;

/**
 * Created by np1213 on 23/04/16.
 */
public class Piece {

    private final List<Offset> moves;
    private final List<Offset> captureMoves;

    public Piece(List<Offset> moves)
    {
        this(moves, moves);
    }
    public Piece(List<Offset> moves, List<Offset> captureMoves)
    {
        this.moves = moves;
        this.captureMoves = captureMoves;
    }

    public List<Offset> getMoves()
    {
        return moves;
    }

    public List<Offset> getCaptureMoves()
    {
        return captureMoves;
    }
}
