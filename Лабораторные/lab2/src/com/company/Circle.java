package com.company;

public class Circle {
    private float radius, diametr;

    public Circle(float radius, float diametr)
    {
        this.radius = radius;
        this.diametr = diametr;
    }

    public float getRadius()
    {
        return radius;
    }

    public float getDiametr()
    {
        return  diametr;
    }

    public void setRadius(float radius)
    {
        this.radius = radius;
    }

    public void setDiametr(float diametr)
    {
        this.diametr = diametr;
    }

}
