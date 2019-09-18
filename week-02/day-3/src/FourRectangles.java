import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

    public static void mainDraw(Graphics graphics) {

        Random random = new Random();

        for (int i = 0; i < 4; i++) {
            int rectWidth = random.nextInt(WIDTH - 1) + 1;
            int rectHeight = random.nextInt(HEIGHT - 1) + 1;
            int x = random.nextInt(WIDTH - rectWidth);
            int y = random.nextInt(HEIGHT - rectHeight);

            graphics.setColor(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)));
            graphics.drawRect(x, y, rectWidth, rectHeight);

        }

        // draw four different size and color rectangles.
        // avoid code duplication.


    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

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