import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {
    public static void mainDraw(Graphics graphics) {

        int distance = 20;
        int lineNumber = 16;



        for (int i = 0; i < lineNumber; i++) {
            graphics.setColor(Color.GREEN);
            graphics.drawLine(i * distance, HEIGHT/2, WIDTH/2, HEIGHT/2 + i* distance);//3.quarter
            //graphics.setColor(Color.BLUE);
            graphics.drawLine(WIDTH/2,  i * distance,  HEIGHT/2 + i * distance, HEIGHT/2);//1.quarter
            //graphics.setColor(Color.RED);
            graphics.drawLine(WIDTH/2, i*distance, WIDTH/2-i*distance, HEIGHT/2);//4.quarter
            graphics.drawLine(WIDTH/2, HEIGHT-i*distance, WIDTH/2 + i*distance,HEIGHT/2); //2.quarter
        }
    }

    // Don't touch the code below
    static int WIDTH = 600;
    static int HEIGHT = 600;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}