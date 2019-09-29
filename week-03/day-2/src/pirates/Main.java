package pirates;

public class Main {
    public static void main(String[] args) {
        Pirate sparrow = new Pirate();
        Ship blackPearl = new Ship();
        Pirate jeff = new Pirate();
        Ship hableany = new Ship();

        sparrow.drinkSomeRum();
        sparrow.drinkSomeRum();
        sparrow.howsItGoingMate();
        System.out.println(sparrow.isDead);
        sparrow.drinkSomeRum();
        //jeff.die();
        sparrow.brawl(jeff);
        System.out.println("Sparrow died " + sparrow.isDead);
        System.out.println("Jeff died " + jeff.isDead);

        blackPearl.fillShip();
        System.out.println("Blackpearl's score is " + blackPearl.calculateScore(blackPearl));
        hableany.fillShip();
        System.out.println("Hableany's score is " + hableany.calculateScore(hableany));


        System.out.println(blackPearl.battle(hableany));
        blackPearl.statusReport();
        hableany.statusReport();

    }
}
