package com.company;

public class Square extends Recktangle {
    public Square() {}
    public Square (double side)
    {
        width = side;
        height = side;
    }
    public Square(double side, String color, boolean filled)
    {
        super(side, side, color, filled);
        width = side;
        height = side;
    }

    public double getSide()
    {
        return width;
    }

    public void setSide(double side)
    {
        width = side;
        height = side;
    }

    @Override public void setWidth(double side)
    {
        width = side;
        height = side;
    }

    @Override public void setHeight(double side)
    {
        width = side;
        height = side;
    }

    @Override public String toString()
    {
        return "Color " + color + " Filled " + filled + " Side " + width;
    }
}
