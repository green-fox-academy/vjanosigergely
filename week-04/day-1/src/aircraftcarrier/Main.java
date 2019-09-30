package aircraftcarrier;

public class Main {
    public static void main(String[] args) {
        F16 firstFighter = new F16();
        F35 secondFighter = new F35();
        Carrier mutterShip = new Carrier(1000,1000);

        mutterShip.carriedAircrafts.add(firstFighter);
        mutterShip.carriedAircrafts.add(secondFighter);

        mutterShip.fill();

       /* System.out.println(secondFighter.isPriority());

        System.out.println(firstFighter.getStatus());
        System.out.println(firstFighter.isPriority());

        System.out.println(firstFighter.baseDamage + " " +  firstFighter.maxAmmo + " " + firstFighter.currentAmmo);
        System.out.println(firstFighter.refill(100));
        System.out.println(firstFighter.baseDamage + " " +  firstFighter.maxAmmo + " " + firstFighter.currentAmmo);
        System.out.println(firstFighter.fight());
        System.out.println(firstFighter.baseDamage + " " +  firstFighter.maxAmmo + " " + firstFighter.currentAmmo);
*/

    }
}
