package com.company;

public class Meat extends Product {
    public Meat(String Mark, int Price)
    {
        super(Mark,Price);
    }

    @Override public String toString()
    {
        return "Вы выбрали мясо марки " + Mark + " его стоимость " + Integer.toString(Price) + " ,общая стоимость всех покупок " + globalPrice + "\n";
    }
}
