import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SuperHexagonNEW {
    public static void mainDraw(Graphics graphics) {
        int xMiddle = WIDTH/2;
        int yMiddle = HEIGHT/2;

        int b = 10;
        int a = 12; //(int) (b/Math.sqrt(3));


        int xA = xMiddle - a;      int yA = yMiddle-b;
        int xB = xMiddle + a;      int yB = yMiddle-b;
        int xC = xMiddle + 2*a;    int yC = yMiddle;
        int xD = xMiddle + a;      int yD = yMiddle+b;
        int xE = xMiddle - a;      int yE = yMiddle+b;
        int xF = xMiddle - 2*a;     int yF = yMiddle;

        int[] xpoints = {xA, xB, xC, xD, xE, xF};
        int[] ypoints = {yA, yB, yC, yD, yE, yF};
        int[] xpointsOriginal = {xA, xB, xC, xD, xE, xF};
        int[] ypointsOriginal = {yA, yB, yC, yD, yE, yF};

        int npoints = 6;

        //middle flower
        drawFlower (graphics, xpoints,ypoints,xpointsOriginal,
        ypointsOriginal, npoints, a, b);

        //top flower

        for (int j = 0; j < ypoints.length ; j++) {
            ypoints[j] = ypoints[j]- 10*b;
        }

        drawFlower (graphics, xpoints,ypoints,xpointsOriginal,
                ypointsOriginal, npoints, a, b);




        //topright flower
        //bottomright flower
        //bottom flower
        //bottommleft flower
        //topleft flower



        }

    public static void drawFlower (Graphics graphics, int[] xpoints, int[] ypoints, int[] xpointsOriginal,
                                    int[] ypointsOriginal, int npoints, int a, int b) {

        graphics.drawPolygon(xpoints, ypoints, npoints);

        //upwards
        for (int j = 0; j < xpoints.length ; j++) {
            ypoints[j] = ypoints[j]- 2*b;
        }
        //graphics.setColor(Color.BLUE);
        graphics.drawPolygon(xpoints, ypoints, npoints);
        for (int j = 0; j < xpoints.length ; j++) {
            ypoints[j] = ypointsOriginal[j];
        }


        //topright
        for (int j = 0; j < xpoints.length ; j++) {
            xpoints[j] = xpoints[j] + 3*a;
            ypoints[j] = ypoints[j] - b;
        }
        //graphics.setColor(Color.GREEN);
        graphics.drawPolygon(xpoints, ypoints, npoints);

        for (int j = 0; j < xpoints.length ; j++) {
            xpoints[j] = xpointsOriginal[j];
            ypoints[j] = ypointsOriginal[j];
        }

        //bottomright
        for (int j = 0; j < xpoints.length ; j++) {
            xpoints[j] = xpoints[j] + 3*a;
            ypoints[j] = ypoints[j] + b;
        }
        graphics.drawPolygon(xpoints, ypoints, npoints);
        for (int j = 0; j < xpoints.length ; j++) {
            xpoints[j] = xpointsOriginal[j];
            ypoints[j] = ypointsOriginal[j];
        }

        //bottom
        for (int j = 0; j < xpoints.length ; j++) {
            ypoints[j] = ypoints[j] + 2*b;
        }

        graphics.drawPolygon(xpoints, ypoints, npoints);

        for (int j = 0; j < xpoints.length ; j++) {
            ypoints[j] = ypointsOriginal[j];
        }

        //bottomleft
        for (int j = 0; j < xpoints.length ; j++) {
            xpoints[j] = xpoints[j] - 3*a;
            ypoints[j] = ypoints[j] + b;
        }

        graphics.drawPolygon(xpoints, ypoints, npoints);

        for (int j = 0; j < xpoints.length ; j++) {
            xpoints[j] = xpointsOriginal[j];
            ypoints[j] = ypointsOriginal[j];
        }

        //topleft
        for (int j = 0; j < xpoints.length ; j++) {
            xpoints[j] = xpoints[j] - 3 * a;
            ypoints[j] = ypoints[j] - b;
        }

        graphics.drawPolygon(xpoints, ypoints, npoints);

        for (int j = 0; j < xpoints.length ; j++) {
            xpoints[j] = xpointsOriginal[j];
            ypoints[j] = ypointsOriginal[j];
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