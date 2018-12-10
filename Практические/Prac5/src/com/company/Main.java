package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner inn = new Scanner(System.in);
        //zadanie1(5, 1);
        //zadanie2(5, 1);
        /*
        int A = inn.nextInt();
        int B = inn.nextInt();
        zadanie3(A, B);
        */

    }

    static void zadanie1(int n, int count)
    {
        for (int i = 0; i < count; i++)
        {
            System.out.print(count + " ");
        }
        if (count < n) zadanie1(n, ++count);
    }

    static  void zadanie2(int n, int count)
    {
        System.out.print(count + " ");
        if (count < n) zadanie2(n, ++count);
    }

    static void zadanie3(int A, int B)
    {
        System.out.print(A + " ");
        if (A < B) zadanie3(++A, B);
        else if (A > B) zadanie3(--A, B);
    }
}
