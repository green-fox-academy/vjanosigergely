package aircraftcarrier;

import java.util.ArrayList;
import java.util.List;

public class Carrier {
    List<Aircraft> carriedAircrafts = new ArrayList();
    int ammoStore;
    int healthPoint;

    Carrier(int initialAmmo, int healthPoint){
        this.ammoStore = initialAmmo;
        this.healthPoint = healthPoint;
    }
    //add
    //It should take a new aircraft and add it to its storage
    public void add (Aircraft aircraft){
        carriedAircrafts.add(aircraft);
    }
    //fill
    //It should fill all the aircraft with ammo and subtract the needed ammo from the ammo storage
    //If there is not enough ammo then it should start to fill the aircrafts with priority first
    //If there is no ammo when this method is called, it should throw an exception
    public void fill(){
        if (ammoStore > 0) {
                for (Aircraft aircaft : carriedAircrafts) {
                    if (aircaft.isPriority) {
                        int neededAmmo = aircaft.maxAmmo - aircaft.currentAmmo;
                        int toFill = Math.min(neededAmmo, ammoStore);
                        aircaft.currentAmmo += toFill;
                        ammoStore -= toFill;
                    }

                }
                for (Aircraft aircaft : carriedAircrafts) {
                    if (aircaft.isPriority == false) {
                        int neededAmmo = aircaft.maxAmmo - aircaft.currentAmmo;
                        int toFill = Math.min(neededAmmo, ammoStore);
                        aircaft.currentAmmo += toFill;
                        ammoStore -= toFill;
                    }
                }

        } else {
            System.out.println("There is no ammo in the store");
        }
    }
    //fight
    //It should take another carrier as a reference parameter
    // and fire all the ammo from the aircrafts to it, then subtract all the damage from its health points
    public void fight (Carrier othercarrier){

    }


}


//The carrier should be able to store aircrafts
//Each carrier should have a store of ammo represented as number
//The initial ammo should be given by a parameter in its constructor
//The carrier also has a health point given in its constructor as well