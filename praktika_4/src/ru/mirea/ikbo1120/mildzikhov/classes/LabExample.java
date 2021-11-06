package ru.mirea.ikbo1120.mildzikhov.classes;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class LabExample extends JFrame
{
    JButton spartak = new JButton("Спартак");
    JButton zenit = new JButton("Зенит");
    JLabel result = new JLabel();
    JLabel lastScorer = new JLabel();
    Label winner = new Label();
    protected void processWindowEvent(WindowEvent e){if (e.getID() == WindowEvent.WINDOW_CLOSING) {System.exit(0);}}
    public LabExample()
    {
        int heght = 1000, width = 1000;
        int spartakCounter = 0;
        int zenitCounter = 0;
        setSize(1000,1000);
        setVisible(true);
    }
}
