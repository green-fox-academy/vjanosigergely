import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {
    public static void mainDraw(Graphics graphics) {
        // Create a function that draws a single line and takes 3 parameters:
        // The x and y coordinates of the line's starting point and the graphics
        // and draws a line from that point to the center of the canvas.
        // Fill the canvas with lines from the edges, every 20 px, to the center.

        int x = 0;
        int y = 0;

        for (int i = 0; i < WIDTH ; i+=20) {
            x = i;
            drawToCenter(graphics,x,y);
        }

        for (int i = 0; i < WIDTH ; i+=20) {
            x = i;
            y = HEIGHT;
            drawToCenter(graphics,x,y);

        }
        for (int i = 0; i < HEIGHT; i+=20) {
            y=i; x=0;
            drawToCenter(graphics,x,y);
        }
        for (int i = 0; i < HEIGHT ; i+=20) {
            x = WIDTH;
            y = i;
            drawToCenter(graphics,x,y);
        }


    }

    public static void drawToCenter (Graphics graphics, int x, int y) {
        graphics.drawLine(x,y,WIDTH/2,HEIGHT/2);
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