package com.company;

import java.awt.*;

public class Recktangle extends Shape {
    protected double width;
    protected double height;
    public Recktangle() {}
    public Recktangle(double width, double height)
    {
        this.width = width;
        this.height = height;
    }
    public Recktangle(double width, double height, String color, boolean filled)
    {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea()
    {
        return width*height;
    }
    public double getPerimetr()
    {
        return (width+height)*2;
    }

    @Override public String toString()
    {
        return "Color " + color + " Filled " + filled + " Width " + width + " Height" + height;
    }
}
