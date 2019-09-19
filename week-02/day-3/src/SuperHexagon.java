import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SuperHexagon {
    public static void mainDraw(Graphics graphics) {
        int middle = WIDTH/2;
        int side = 12;
        int height = 16;
        int xDiff = (4/3)*side;

        int xA = middle - (side/2);      int yA = 0;
        int xB = middle + side/2;        int yB = 0;
        int xC = middle + side;          int yC = height/2;
        int xD = middle + side/2;        int yD = height;
        int xE = middle - side/2;        int yE = height;
        int xF = middle - side;          int yF = height/2;


        //graphics.setColor(new Color(getRandomNumberWithinParameters(0, 255), getRandomNumberWithinParameters(0, 255), getRandomNumberWithinParameters(0, 255)));
        for (int i = 0; i < 7 ; i++) {


            int[] xpoints = {xA, xB, xC, xD, xE, xF};
            int[] ypoints = {yA + i * height, yB + i * height, yC + i * height, yD + i * height, yE + i * height, yF + i * height};
            int npoints = 6;
            graphics.drawPolygon(xpoints, ypoints, npoints);
        }
        for (int i = 0; i < 6 ; i++) {


            int[] xpoints2 = {
                    xA + xDiff, (xB + xDiff), xC + xDiff,
                    xD + xDiff, xE + xDiff, xF + xDiff
            };
            int[] ypoints2 = {yA + (i * height + height/2), yB + (i * height + height/2),
                                yC + (i * height + height/2), yD + (i * height + height/2),
                                yE + (i * height + height/2), yF + (i * height + height/2)
            };
            int npoints2 = 6;
            graphics.drawPolygon(xpoints2, ypoints2, npoints2);

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