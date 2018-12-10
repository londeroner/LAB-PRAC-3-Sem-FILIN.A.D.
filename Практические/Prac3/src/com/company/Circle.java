package com.company;

public class Circle extends Shape {
    protected double radius;
    public Circle() {}
    public Circle(double radius)
    {
        this.radius = radius;
    }
    public Circle(double radius, boolean filled, String color)
    {
        super(color, filled);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea()
    {
        return  Math.PI * radius*radius;
    }

    public double getPerimetr()
    {
        return 2*Math.PI*radius;
    }

    @Override public String toString()
    {
        return "Color " + color + " Filled " + filled + " Radius " + radius;
    }
}
