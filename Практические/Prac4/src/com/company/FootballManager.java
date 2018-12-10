package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FootballManager extends JFrame {

    private int WinWidth = 400, WinHeight = 200;
    private String LastS = "N/A", winner = "No one";
    private int ACMscore = 0, RMscore = 0;
    JButton ACM = new JButton("AC Milan");
    JButton RM = new JButton("Real Madrid");
    JLabel score = new JLabel("Result: " + ACMscore + " X " + RMscore);
    JLabel LastScore = new JLabel("Last Scorer: " + LastS);
    Label win = new Label("Winner: " + winner);
    Font fnt = new Font("Times New Roman", 0, 18);

    public FootballManager()
    {
        super("FootballManager");
        setLayout(null);
        this.setBounds(100, 100, WinWidth, WinHeight);
        ACM.setBounds(20, 10, 100, 30);
        add(ACM);
        RM.setBounds(WinWidth - 130, 10, 100, 30);
        add(RM);
        score.setBounds(150, 10, 100, 30);
        score.setFont(fnt);
        add(score);
        LastScore.setBounds(135, 50, 150, 30);
        LastScore.setFont(fnt);
        add(LastScore);
        win.setBounds(130, 110, 150, 30);
        win.setFont(fnt);
        add(win);
        ACM.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ACMscore = ACMscore + 1;
                score.setText("Result: " + ACMscore + " X " + RMscore);
                LastScore.setBounds(110, 50, 220, 30);
                LastS = "AC Milan";
                LastScore.setText("Last Scorer: " + LastS);
                if (ACMscore > RMscore)
                {
                    win.setBounds(130, 110, 150, 30);
                    winner = "AC Milan";
                    win.setText("Winner: " + winner);
                }
                else if (ACMscore == RMscore)
                {
                    win.setBounds(130, 110, 150, 30);
                    winner = "No one";
                    win.setText("Winner: " + winner);
                }
            }
        });
        RM.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RMscore = RMscore + 1;
                score.setText("Result: " + ACMscore + " X " + RMscore);
                LastScore.setBounds(110, 50, 220, 30);
                LastS = "Real Madrid";
                LastScore.setText("Last Scorer: " + LastS);
                if (ACMscore < RMscore)
                {
                    win.setBounds(115, 110, 180, 30);
                    winner = "Real Madrid";
                    win.setText("Winner: " + winner);
                }
                else if (ACMscore == RMscore)
                {
                    win.setBounds(130, 110, 150, 30);
                    winner = "No one";
                    win.setText("Winner: " + winner);
                }
            }
        });

        setVisible(true);
    }

    public static void main(String[] args)
    {
        new FootballManager();
    }
}
