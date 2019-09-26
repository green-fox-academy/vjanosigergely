package sharpie;

import java.awt.*;

public class Main {
    public static void main(String[] args) {

        Sharpie red = new Sharpie("red", 1.02f);
        Sharpie blue = new Sharpie("Color.blue" , 1.04f);
        Sharpie green = new Sharpie ("green", 1.05f);
        Sharpie yellow = new Sharpie ("yellow", 1.09f);

        SharpieSet first = new SharpieSet();
        first.sharpieList.add(red);
        first.sharpieList.add(blue);
        first.sharpieList.add(green);
        first.sharpieList.add(yellow);
        System.out.println(first.countUsable());

        red.use();
        red.use();
        while (blue.inkAmount > 0) {
            blue.use();
        }

        System.out.println(first.countUsable());
        first.removeTrash();


    }
}
