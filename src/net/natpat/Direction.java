package net.natpat;

/**
 * Created by np1213 on 23/04/16.
 */
public class Direction {

    private final int x;
    private final int y;
    private final int length;

    public Direction(int x, int y)
    {
        this(x, y, 0);
    }
    public Direction(int x, int y, int length)
    {
        this.x = x;
        this.y = y;
        this.length = length;
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    public int getLength()
    {
        return length;
    }
}
