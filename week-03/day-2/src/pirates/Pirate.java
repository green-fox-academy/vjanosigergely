package pirates;

import org.w3c.dom.ls.LSOutput;

public class Pirate {
    Pirate(){
            }

    int toxicityLevel = 0;
    boolean isAlive = true;


    public void drinkSomeRum(){
        if (isAlive) {
            toxicityLevel += 1;
        } else {
            System.out.println("He's dead");
        }
    }

    public void howsItGoingMate(){
        if (isAlive = false) {
            System.out.println("He's dead");
        } else if (toxicityLevel <= 4) {
            System.out.println("Pour me anudder!");
        } else {
            System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
            toxicityLevel = 0;
        }
    }

    public void die(){
        isAlive = false;
    }

    public void brawl(Pirate anotherPirate){
        
    }

}


//drinkSomeRum() - intoxicates the Pirate some
//howsItGoingMate() - when called, the Pirate replies, if drinkSomeRun was called:-
//0 to 4 times, "Pour me anudder!"
//else, "Arghh, I'ma Pirate. How d'ya d'ink its goin?", the pirate passes out and sleeps it off.
//If you manage to get this far, then you can try to do the following.
//
//die() - this kills off the pirate, in which case, drinkSomeRum, etc. just result in he's dead.
//brawl(x) - where pirate fights another pirate (if that other pirate is alive) and there's a 1/3 chance, 1 dies, the other dies or they both pass out.
//And... if you get that far...
//
//Add a parrot.