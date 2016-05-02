package net.natpat;

/**
 * Created by np1213 on 23/04/16.
 */
public class Position {

    private final int x;
    private final int y;

    public Position(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    public boolean equals(Object o)
    {
        if(!(o instanceof Position))
            return false;
        Position po = (Position) o;
        return (po.x == x && po.y == y);
    }

    public int hashCode()
    {
        int diag = (x+y);
        int start = (diag * (diag + 1))/2;
        int offset = diag - x;
        return start + offset;
    }

    public Position add(Offset offset)
    {
        return new Position(x + offset.getX(), y + offset.getY());
    }

}
