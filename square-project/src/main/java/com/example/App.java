package com.example;

import javax.swing.*;
import java.awt.*;

public class App extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        // Continuous line
        g2.setStroke(new BasicStroke(3));

        // Draw square
        g2.drawRect(100, 100, 250, 250);
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("Square");

        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(new App());
        frame.setVisible(true);
    }
}