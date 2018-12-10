package com.company;

public class BookCreator {
    public static void main(String[] args)
    {
        Book b1 = new Book();
        Book b2 = new Book("Роман");
        Book b3 = new Book(500);
        Book b4 = new Book(500, "Детектив");

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
    }
}
