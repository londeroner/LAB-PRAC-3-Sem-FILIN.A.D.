package com.company;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.*;

public class ImageShow extends JFrame{
    private int width = 800;
    private int height = 700;

    JLabel jl = new JLabel();

    public ImageShow(String arg) {
        setSize(width, height);
        setTitle("lab5");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        jl.setIcon(new ImageIcon(arg));
        add(jl);
        setVisible(true);

    }


    public static void main(String args[])
    {
        new ImageShow(args[0]);
    }
}
