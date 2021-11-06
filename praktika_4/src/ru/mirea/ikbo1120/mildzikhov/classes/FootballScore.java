package ru.mirea.ikbo1120.mildzikhov.classes;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class FootballScore extends JFrame
{
    JButton spartak = new JButton("Спартак");
    JButton zenit = new JButton("Зенит");
    JLabel result = new JLabel("Счёт", SwingConstants.CENTER);
    JLabel lastScorer = new JLabel("Последний гол: N/A", SwingConstants.CENTER);
    JLabel winner = new JLabel("ИТОГ: НИЧЬЯ", SwingConstants.CENTER);
    Font verdana = new Font("Verdana", Font.PLAIN, 60);
    int spartakCounter = 0;
    int zenitCounter = 0;
    protected void processWindowEvent(WindowEvent e){if (e.getID() == WindowEvent.WINDOW_CLOSING) {System.exit(0);}}
    public FootballScore()
    {
        int height = 1000, width = 1000;
        setLayout(null);
        spartak.setBounds(0,height/2, width/4,height/2);
        zenit.setBounds(width/4 * 3,height/2, width/4,height/2);
        spartak.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                spartakCounter++;
                result.setText("Счёт: " + spartakCounter + " X " + zenitCounter);
                lastScorer.setText("Последний гол: Спартак");
                if(zenitCounter > spartakCounter) {winner.setText("ИТОГ: Победитель Зенит");}
                else if(zenitCounter == spartakCounter) {winner.setText("ИТОГ: НИЧЬЯ");}
                else {winner.setText("ИТОГ: Победитель Спартак");}
            }
        });
        zenit.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                zenitCounter++;
                result.setText("Счёт: " + spartakCounter + " X " + zenitCounter);
                lastScorer.setText("Последний гол: Зенит");
                if(zenitCounter > spartakCounter) {winner.setText("ИТОГ: Победитель Зенит");}
                else if(zenitCounter == spartakCounter) {winner.setText("ИТОГ: НИЧЬЯ");}
                else {winner.setText("ИТОГ: Победитель Спартак");}
            }

        });
        add(zenit);
        add(spartak);
        int resultSize = 50;
        result.setBounds(0,0,width,60);
        result.setFont(verdana);
        result.setText("Счёт: " + spartakCounter + " X " + zenitCounter);
        add(result);
        lastScorer.setBounds(0,70, width, 60);
        lastScorer.setFont(verdana);
        add(lastScorer);
        winner.setBounds(0, 140, width, 60);
        winner.setFont(verdana);
        winner.setForeground(Color.GREEN);
        add(winner);
        setSize(1000,1000);
        setVisible(true);
    }
}