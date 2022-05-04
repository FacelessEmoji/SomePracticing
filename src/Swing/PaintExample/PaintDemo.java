package Swing.PaintExample;

import javax.swing.*;

public class PaintDemo {
    JLabel label;
    PaintPanel paintPanel;
    PaintDemo(){
        JFrame frame = new JFrame("PaintTest");
        frame.setSize(200,150);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        paintPanel = new PaintPanel();
        frame.add(paintPanel);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(PaintDemo::new);
    }
}
