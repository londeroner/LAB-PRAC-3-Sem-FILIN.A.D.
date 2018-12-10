package com.company;
import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try (FileWriter writer = new FileWriter("C:\\Users\\Londeroner\\IdeaProjects\\lab8\\file.txt", true))
        {
            String text = sc.nextLine();
            writer.write(text + "\r\n");

            writer.flush();
        }
        catch (IOException ex)
        {
            System.out.print(ex.getMessage());
        }
    }
}
