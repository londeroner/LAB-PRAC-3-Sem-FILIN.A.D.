package com.company;

public abstract class Dish {
    protected String material;
    protected String color;

    public String getMaterial()
    {
        return material;
    }

    public void setMaterial(String material)
    {
        this.material = material;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public Dish() {}

    public Dish (String material, String color)
    {
        this.material = material;
        this.color = color;
    }

    @Override public String toString()
    {
        return "Посуда{" + material + '\'' + ", цвет" + color + '\'' + '}';
    }
}
