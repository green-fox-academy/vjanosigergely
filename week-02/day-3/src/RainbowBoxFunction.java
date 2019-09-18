import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void mainDraw(Graphics graphics) {
        // Create a square drawing function that takes 3 parameters:
        // The square size, the fill color, graphics
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares (red, orange, yellow, green, blue, indigo, violet).
        Random random = new Random();


        /*Color color = new Color();*/

        Color[] colors = {Color.RED, Color.orange, Color.yellow, Color.green, Color.blue,
                new Color(29, 0, 51), new Color(93, 51, 93)};

        for (int i = 0; i < colors.length; i++) {
            Color color = colors[i];
            int a = random.nextInt(WIDTH - 1);
            int size = a * a;
            drawRainbow(size, graphics, color);

        }
    }




    public static void drawRainbow(int size, Graphics graphics, Color color) {
        int squareLine = (int) Math.sqrt(size);
        graphics.setColor(color);
        graphics.drawRect((WIDTH - squareLine) / 2, (HEIGHT - squareLine) / 2, squareLine, squareLine);
    }

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