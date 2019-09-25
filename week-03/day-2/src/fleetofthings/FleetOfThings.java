package fleetofthings;


public class FleetOfThings {

    public static void main(String[] args) {
        Fleet fleet = new Fleet();

        Thing milk = new Thing("Get milk");
        Thing remove = new Thing ("Remove the obstacles");
        Thing stand = new Thing ("Stand up");
        stand.complete();;
        Thing lunch = new Thing ("Eat lunch");
        lunch.complete();

        fleet.add (milk);
        fleet.add(remove);
        fleet.add(stand);
        fleet.add(lunch);


        // - You have the `Thing` class
        // - You have the `Fleet` class
        // - You have the `FleetOfThings` class with a `main` method
        // - Download those, use those
        // - In the main method create a fleet

       /*Thing milk = new Thing("Get milk");
        System.out.println(milk.toString());
        Thing remove = new Thing ("Remove the obstacles");
        System.out.println(remove);
        Thing stand = new Thing ("Stand up");
        stand.complete();
        Thing lunch = new Thing ("Eat lunch");
        lunch.complete();
        System.out.println(stand);
        System.out.println(lunch);*/
        // - Achieve this output:
        // Create a fleet of things to have this output:
        // 1. [ ] Get milk
        // 2. [ ] Remove the obstacles
        // 3. [x] Stand up
        // 4. [x] Eat lunch

        System.out.println(fleet);
    }
}