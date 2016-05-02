package net.natpat;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by np1213 on 23/04/16.
 */
public class Moves {

    public static List<Offset> diagonals(int boardSize)
    {
        List<Offset> diags = new ArrayList<Offset>();
        for(int i = 0; i < boardSize; i++)
        {
            diags.add(new Offset(i, i));
            diags.add(new Offset(i, -i));
            diags.add(new Offset(-i, i));
            diags.add(new Offset(-i, -i));
        }
        return diags;
    }

    public static List<Offset> cardinals(int boardSize)
    {
        List<Offset> moves = new ArrayList<Offset>();
        for(int i = 0; i < boardSize; i++)
        {
            moves.add(new Offset(0, i));
            moves.add(new Offset(0, -i));
            moves.add(new Offset(i, 0));
            moves.add(new Offset(-i, 0));
        }
        return moves;
    }

    public static List<Offset> around()
    {
        List<Offset> moves = new ArrayList<Offset>();
        for(int x = -1; x <= 1; x++)
        {
            for(int y = -1; y <= 1; y++)
            {
                if(x == 0 && y == 0) continue;
                moves.add(new Offset(x, y));

            }
        }
        return moves;
    }

    public static List<Offset> knight(int radius)
    {
        List<Offset> moves = new ArrayList<Offset>();
        for(int i = 1; i < radius; i++)
        {
            moves.add(new Offset(radius - i, i));
            moves.add(new Offset(radius - i, -i));
            moves.add(new Offset(-(radius - i), i));
            moves.add(new Offset(-(radius - i), -i));
        }
        return moves;
    }

}
