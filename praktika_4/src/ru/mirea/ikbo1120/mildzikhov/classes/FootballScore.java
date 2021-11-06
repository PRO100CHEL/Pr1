package ru.mirea.ikbo1120.mildzikhov.classes;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class FootballScore extends JFrame
{
    JButton barcelona = new JButton("Barcelona");
    JButton milan = new JButton("AC Milan");
    JLabel result = new JLabel("Result", SwingConstants.CENTER);
    JLabel lastScorer = new JLabel("LastScorer: N/A", SwingConstants.CENTER);
    JLabel winner = new JLabel("Winner: DRAW", SwingConstants.CENTER);
    Font verdana = new Font("Verdana", Font.PLAIN, 60);
    int barcelonaCounter = 0;
    int milanCounter = 0;
    protected void processWindowEvent(WindowEvent e){if (e.getID() == WindowEvent.WINDOW_CLOSING) {System.exit(0);}}
    public FootballScore()
    {
        int height = 1000, width = 1000;
        setLayout(null);
        barcelona.setBounds(0,height/2, width/4,height/2);
        milan.setBounds(width/4 * 3,height/2, width/4,height/2);
        barcelona.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                barcelonaCounter++;
                result.setText("Result: " + barcelonaCounter + " X " + milanCounter);
                lastScorer.setText("Last Scorer: Barcelona");
                if(milanCounter > barcelonaCounter) {winner.setText("Winner: AC Milan");}
                else if(milanCounter == barcelonaCounter) {winner.setText("Winner: DRAW");}
                else {winner.setText("Winner: Barcelona");}
            }
        });
        milan.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                milanCounter++;
                result.setText("Result: " + barcelonaCounter + " X " + milanCounter);
                lastScorer.setText("Last Scorer: AC Milan");
                if(milanCounter > barcelonaCounter) {winner.setText("Winner: AC Milan");}
                else if(milanCounter == barcelonaCounter) {winner.setText("Winner: DRAW");}
                else {winner.setText("Winner: Barcelona");}
            }

        });
        add(milan);
        add(barcelona);
        int resultSize = 50;
        result.setBounds(0,0,width,60);
        result.setFont(verdana);
        result.setText("Result: " + barcelonaCounter + " X " + milanCounter);
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