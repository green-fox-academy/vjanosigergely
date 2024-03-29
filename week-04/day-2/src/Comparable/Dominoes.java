package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Dominoes {
    public static void main(String[] args) {
        List<Domino> dominoes = initializeDominoes();
        // You have the list of Dominoes
        // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
        // eg: [2, 4], [4, 3], [3, 5] ...

        System.out.println(dominoes);

        Collections.sort(dominoes);
        System.out.println(dominoes);

        List<Thing> things = new ArrayList<Thing>();
        Thing potato = new Thing("potato");
        Thing carrot = new Thing ("carrot");
        Thing chesstable = new Thing("chesstable");
        Thing getAngry = new Thing("getAngry");

        potato.complete();
        chesstable.complete();

        things.add(potato);
        things.add(carrot);
        things.add(chesstable);
        things.add(getAngry);

        System.out.println(things);
        Collections.sort(things);
        System.out.println(things);



    }

    static List<Domino> initializeDominoes() {
        List<Domino> dominoes = new ArrayList<>();
        dominoes.add(new Domino(5, 2));
        dominoes.add(new Domino(4, 6));
        dominoes.add(new Domino(1, 5));
        dominoes.add(new Domino(6, 7));
        dominoes.add(new Domino(2, 4));
        dominoes.add(new Domino(7, 1));
        dominoes.add(new Domino(1,4));
        dominoes.add(new Domino(1,4));
        return dominoes;

    }
}