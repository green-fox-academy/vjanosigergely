package pirates;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;

public class Pirate {
    Pirate(){
            }

    int toxicityLevel = 0;
    boolean isDead = false;
    boolean passedOut = false;
    Random random = new Random();


    public void drinkSomeRum(){
        if (isDead == true) {
            System.out.println("He's dead");
        } else {
            toxicityLevel += 1;
        }
    }

    public void howsItGoingMate(){
        if (isDead == true) {
            System.out.println("He's dead");
        } else if (toxicityLevel <= 4) {
            System.out.println("Pour me anudder!");
        } else {
            System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
            passOut();
        }
    }

    public void die(){
        isDead = true;
    }

    public void passOut(){
        toxicityLevel = 0;
        passedOut = true;
        System.out.println("Pirate is passed out");
    }

    public void brawl(Pirate anotherPirate){
        if (anotherPirate.isDead == false) {
            int chance = random.nextInt(3);
            switch (chance) {
                case 0:
                    anotherPirate.passOut();
                    this.passOut();
                    break;
                case 1:
                    anotherPirate.die();
                    break;
                case 2:
                    this.die();
                    break;
            }
        }

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