package com.company;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.lang.String;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(lab15(5));
    }

    public static void lab11()
    {
        int[] mas = {0, 1, 2, 3, 4, 5};
        int summ = 0, i;
        for (i = 0; i < mas.length; i++)
            summ += mas[i];
        System.out.println(summ);
        summ = 0; i = 0;
        while (i < mas.length) {
            summ += mas[i];
            i++;
        }
        System.out.println(summ);
        summ = 0; i = 0;
        do {
            summ += mas[i];
            i++;
        } while (i < mas.length);
        System.out.println(summ);
    }

    public static void lab12(@NotNull String[] args2)
    {
        for (int i = 0; i < args2.length; i++)
            System.out.println(args2[i]);
    }

    public static void lab13()
    {
        for (int i = 1; i <= 10; i++)
            System.out.print("1/" + i + " ");
        System.out.println();
    }

    public static void lab14()
    {
        Random rnd = new Random(System.currentTimeMillis());
        int[] mas = new int[10];
        for (int i = 0; i < 10; i++)
        {
            mas[i] = rnd.nextInt(50);
            System.out.print(mas[i] + " ");
        }
        System.out.print("\n");
        Arrays.sort(mas);
        for (int i = 0; i < 10; i++)
        {
            System.out.print(mas[i] + " ");
        }
    }

    public static int lab15(int n)
    {
        int p = 1;
        for (int i = 2; i <= n; i++)
            p*=i;
        return  p;
    }
}
