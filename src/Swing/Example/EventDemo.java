package Swing.Example;

import javax.swing.*;
import java.awt.*;

public class EventDemo {
    JLabel label;

    EventDemo(){
        JFrame frame = new JFrame("EventDemo");
        frame.setLayout(new FlowLayout());
        frame.setSize(600,200);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);



        JButton buttonAlpha = new JButton("Alpha");
        JButton buttonBeta = new JButton("Beta");
/*        buttonAlpha.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Alpha pressed");
            }
        });*/ // - default
        buttonAlpha.addActionListener(e -> label.setText("Alpha pressed"));
        buttonBeta.addActionListener(e -> label.setText("Beta pressed"));

        label = new JLabel("Press a Button");
        frame.add(buttonAlpha);
        frame.add(buttonBeta);
        frame.add(label);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(EventDemo::new);
    }
}
