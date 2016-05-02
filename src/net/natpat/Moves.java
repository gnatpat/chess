package net.natpat;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by np1213 on 23/04/16.
 */
public class Moves {

    public static List<Direction> diagonals()
    {
        List<Direction> diags = new ArrayList<Direction>();
        diags.add(new Direction(-1, -1));
        diags.add(new Direction(-1, 1));
        diags.add(new Direction(1, -1));
        diags.add(new Direction(1, 1));
        return diags;
    }
    public static List<Direction> cardinals()
    {
        List<Direction> cardinals = new ArrayList<Direction>();
        cardinals.add(new Direction(-1, 0));
        cardinals.add(new Direction(1, 0));
        cardinals.add(new Direction(0, -1));
        cardinals.add(new Direction(0, 1));
        return cardinals;
    }

    public static List<Direction> around()
    {
        List<Direction> moves = new ArrayList<Direction>();
        for(int x = -1; x <= 1; x++)
        {
            for(int y = -1; y <= 1; y++)
            {
                if(x == 0 && y == 0) continue;
                moves.add(new Direction(x, y, 1));

            }
        }
        return moves;
    }

    public static List<Direction> knight(int radius)
    {
        List<Direction> moves = new ArrayList<Direction>();
        for(int i = 1; i < radius; i++)
        {
            moves.add(new Direction(radius - i, i, 1));
            moves.add(new Direction(radius - i, -i, 1));
            moves.add(new Direction(-(radius - i), i, 1));
            moves.add(new Direction(-(radius - i), -i, 1));
        }
        return moves;
    }

}
