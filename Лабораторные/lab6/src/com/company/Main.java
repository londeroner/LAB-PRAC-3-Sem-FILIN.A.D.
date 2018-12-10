package com.company;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

public class Main extends JFrame {

    JButton jb1 = new JButton("North");
    JButton jb2 = new JButton("East");
    JButton jb3 = new JButton("West");
    JButton jb4 = new JButton("South");
    JButton jb5 = new JButton("Center");

    public Main()
    {
        super("Programm");
        setSize(400, 400);
        setLayout(new BorderLayout());
        add(jb1, BorderLayout.NORTH);
        add(jb2, BorderLayout.EAST);
        add(jb3, BorderLayout.WEST);
        add(jb4, BorderLayout.SOUTH);
        add(jb5, BorderLayout.CENTER);

        jb1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                JOptionPane.showMessageDialog(null, "Добро пожаловать на север");
            }
        });
        jb2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                JOptionPane.showMessageDialog(null, "Добро пожаловать на восток");
            }
        });
        jb3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                JOptionPane.showMessageDialog(null, "Добро пожаловать на запад");
            }
        });
        jb4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                JOptionPane.showMessageDialog(null, "Добро пожаловать на юг");
            }
        });
        jb5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                JOptionPane.showMessageDialog(null, "Добро пожаловать в центр");
            }
        });
    }


    public static void main(String[] args) {
	    new Main().setVisible(true);
    }
}
