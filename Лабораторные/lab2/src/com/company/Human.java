package com.company;

public class Human {
    class Head
    {
        public void method()
        {
            System.out.println("Hello, Im Head");
        }
    }
    class Leg
    {
        public void method()
        {
            System.out.println("Hello, Im Leg");
        }
    }
    class Hand
    {
        public void method()
        {
            System.out.println("Hello, Im Hand");
        }
    }

    public void method()
    {
        System.out.println("Hello, Im Human");
    }

    Head head = new Head();
    Leg leg = new Leg();
    Hand hand = new Hand();
}
