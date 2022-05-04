package Swing.Example;

import javax.swing.*;

public class SwingDemo {
    SwingDemo() {
        JFrame frame = new JFrame("Test window name");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Test");
        frame.add(label);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        //Короче, выполнение этой последовательности кода приводит к созданию объекта типа SwingDemo
        // в потоке диспетчеризации событий, а не в главном потоке, чтобы не поймать взаимную блокировку.

/*     SwingUtilities.invokeLater(new Runnable() {
         @Override
         public void run() {
             new SwingDemo(); // вызов конструктора класса
         }
     });*/

        //SwingUtilities.invokeLater(() -> new SwingDemo()); // lambda - создает новый объект типа Runnable и в run
        // новый поток в SwingDemo

        SwingUtilities.invokeLater(SwingDemo::new);

        //???????
    }
}
