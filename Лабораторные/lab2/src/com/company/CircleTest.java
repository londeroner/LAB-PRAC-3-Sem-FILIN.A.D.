package com.company;

public class CircleTest {

    public static void main(String[] args) {
        lab22();
    }

    public static void lab21()
    {
        Circle obj = new Circle(5.5f, 11f);
        System.out.println(obj.getRadius() + " " + obj.getDiametr());
        obj.setDiametr(20);
        obj.setRadius(10);
        System.out.println(obj.getRadius() + " " + obj.getDiametr());
    }

    public static void lab22()
    {
        Human obj = new Human();
        obj.leg.method();
        obj.hand.method();
        obj.head.method();
        obj.method();
    }
}
