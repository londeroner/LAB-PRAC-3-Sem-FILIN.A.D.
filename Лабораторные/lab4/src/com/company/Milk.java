package com.company;

public class Milk extends Product {

    public Milk(String Mark, int Price)
    {
        super(Mark,Price);
    }

    @Override public String toString()
    {
        return "Вы выбрали молоко марки " + Mark + " его стоимость " + Integer.toString(Price) + " ,общая стоимость всех покупок " + globalPrice + "\n";
    }
}
