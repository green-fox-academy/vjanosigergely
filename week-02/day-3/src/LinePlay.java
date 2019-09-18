import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
    public static void mainDraw(Graphics graphics) {

        int distance = 40;
        int lineNumber = 15;
        int startGap = 85;
        int endGap = HEIGHT - 15;

        for (int i = 0; i < lineNumber; i++) {
            graphics.setColor(new Color(178, 102, 255));
            graphics.drawLine(startGap + i * distance, 0, WIDTH, (HEIGHT - endGap) + i * distance);
            graphics.setColor(Color.GREEN);
            graphics.drawLine(0, startGap + i * distance, (HEIGHT - endGap) + i * distance, WIDTH);
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