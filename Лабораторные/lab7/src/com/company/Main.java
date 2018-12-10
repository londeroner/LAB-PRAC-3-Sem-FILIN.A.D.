package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(5);
        list.add(1);
        list.add(10);
        list.add(5);
        list.add(7);
        list.add(15);
        for (int lis : list)
        {
            System.out.print(lis + " ");
        }
        System.out.print('\n');
        Collections.sort(list);
        for (int lis : list)
        {
            System.out.print(lis + " ");
        }
        System.out.print('\n');
        list.remove(list.size() - list.indexOf(5));
        list.remove(list.indexOf(1));
        List<Integer> list2 = list.subList(0,2);
        for (int lis : list)
        {
            System.out.print(lis + " ");
        }
        System.out.print('\n');
        list.addAll(2, list2);
        for (int lis : list)
        {
            System.out.print(lis + " ");
        }
        System.out.print('\n');

    }
}
