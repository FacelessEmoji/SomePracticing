package Swing.PaintExample;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class PaintPanel extends JPanel {
    Insets insets;
    Random random;

    PaintPanel(){
        setBorder(BorderFactory.createLineBorder(Color.RED,5));
        random = new Random();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int x,y,x2,y2;
        int height = getHeight();
        int width = getWidth();
        insets = getInsets();
        for (int i = 0; i < 10; i++) {
            x = random.nextInt(width-insets.left);
            y = random.nextInt(height - insets.bottom);
            x2 = random.nextInt(width-insets.left);
            y2 = random.nextInt(height - insets.bottom);
            g.drawLine(x,y,x2,y2);
        }
    }
}
