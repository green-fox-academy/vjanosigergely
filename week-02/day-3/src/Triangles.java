import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
    public static void mainDraw(Graphics graphics) {

        int triangleSide = 20;
        int triangleHeight = (int) ((Math.sqrt(3))/2*triangleSide);
        int bottomTrianglesQuantity = 20;
        int bigTriangleSide = (bottomTrianglesQuantity * triangleSide);
        int bigTriangleHeight = (int) ((Math.sqrt(3))/2*bigTriangleSide);



        for (int i = 0; i < bottomTrianglesQuantity; i++) {
            //graphics.setColor(Color.GREEN);
            graphics.drawLine(i * triangleSide, HEIGHT, bigTriangleSide/2 + triangleSide/2*i, (HEIGHT-bigTriangleHeight) + i*triangleHeight);
            //graphics.setColor(Color.BLUE);
            graphics.drawLine(i*triangleSide/2,  HEIGHT - (i*triangleHeight),  bigTriangleSide - (i*triangleSide/2), HEIGHT - (i*triangleHeight));
            //graphics.setColor(Color.RED);
            graphics.drawLine((bigTriangleSide/2) - (i*(triangleSide/2)), (HEIGHT-bigTriangleHeight) + (i*triangleHeight), bigTriangleSide - (i*triangleSide), HEIGHT);

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