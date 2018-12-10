package com.company;

public class Main {

    public static void main(String[] args) {
        Priceable obj1 = createPriceable("Ostankino", 1000, 0);
        System.out.print(obj1);
        Priceable obj2 = createPriceable("Prostokvashino", 500, 1);
        System.out.print(obj2);
        Product.Add(new Meat("Miasko", 2000));
    }

    static Priceable createPriceable(String Mark, int Price, int IndexNumber)
    {
        switch(IndexNumber)
        {
            case 0:
                return new Meat(Mark, Price);
            case 1:
                return  new Milk(Mark, Price);
        }
        return null;
    }
}
