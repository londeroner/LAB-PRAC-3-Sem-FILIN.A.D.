package com.company;

public class TestShape {
    public static void main(String[] args) {
        Shape sq = new Square(10, "red", true);
        System.out.println(sq.getArea());
        System.out.println(sq.getPerimetr());
        System.out.println(((Square) sq).getWidth());
        System.out.println(sq);
    }
}
