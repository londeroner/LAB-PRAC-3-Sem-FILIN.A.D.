package com.company;

public class Product implements Priceable {


    protected String Mark;
    protected int Price;
    public static int globalPrice = 0;

    public int getPrice()
    {
        return Price;
    }

    Product(String Mark, int Price)
    {
        this.Mark = Mark;
        this.Price = Price;
        globalPrice += Price;
    }

    public String getMark() {
        return Mark;
    }

    static void Add(Product p)
    {
        System.out.print(p + "\n");
    }
}
