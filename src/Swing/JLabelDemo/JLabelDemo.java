package Swing.JLabelDemo;

import Patterns.Proxy.Image;

import javax.swing.*;
import java.awt.*;

public class JLabelDemo {
    public JLabelDemo(){
        JFrame frame = new JFrame("JFrame Test");
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(1000,1000);

        ImageIcon icon = new ImageIcon("resources//grass.png");
        JLabel label = new JLabel("Some weird shit",icon,JLabel.CENTER);
        frame.add(label);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(JLabelDemo::new);
    }
}
