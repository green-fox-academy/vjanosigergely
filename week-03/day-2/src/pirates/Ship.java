package pirates;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship {
    List<Pirate> crew = new ArrayList();
    Pirate captain;
    Random random = new Random();


    Ship(){
    }

    public void fillShip(){
        for (int i = 0; i < random.nextInt(100) ; i++) {
                crew.add(new Pirate());
        }
        captain = new Pirate();
    }

    public boolean battle(Ship otherShip){
        boolean thisWins;

        if (this.calculateScore(this) >= otherShip.calculateScore(otherShip) ) {
        otherShip.randomLosses(otherShip);
        this.randomDrinks(this);
        thisWins = true;

        } else {
            otherShip.randomDrinks(otherShip);
            this.randomLosses(this);
            thisWins = false;
        }

        return thisWins;
    }

    public int calculateScore(Ship ship){

        int alive = 0;
        for (int i = 0; i < crew.size()-1 ; i++) {
            if (crew.get(i).isDead == false) {
                alive +=1;
            }
        }
        int score = alive - captain.toxicityLevel;

        return score;

    }
    public void randomLosses (Ship loserShip){
        int deaths = random.nextInt(loserShip.crew.size());
        for (int i = 0; i < deaths-1 ; i++) {
            loserShip.crew.get(i).die();
        }

    }
    public void randomDrinks (Ship winnerShip){
        int rums = random.nextInt();
        for (int i = 0; i < rums ; i++) {
            for (int j = 0; j < winnerShip.crew.size()-1 ; j++) {
                winnerShip.crew.get(j).drinkSomeRum();
            }
        }
    }
    public void statusReport(){
        System.out.println("The captain drank " + String.valueOf(captain.toxicityLevel) + " rums");
        System.out.println(captain.isDead ? "The captain is dead now" : "" );
        System.out.println(captain.passedOut ? "The captain is passed out" : "The capatin is fine");
        System.out.println("There are " + (this.calculateScore(this) + this.captain.toxicityLevel) + " pirates alive on the ship");

    }

}

//Create a Ship class.
//The Ship stores Pirate-s instances in a list as the crew and has one captain who is also a Pirate.
//When a ship is created it doesn't have a crew or a captain.
//The ship can be filled with pirates and a captain via fillShip() method.
//Filling the ship with a captain and random number of pirates.
//Ships should be represented in a nice way on command line including information about
//captains consumed rum, state (passed out / died)
//number of alive pirates in the crew
//Ships should have a method to battle other ships: ship.battle(otherShip)
//should return true if the actual ship (this) wins
//the ship should win if its calculated score is higher
//calculate score: Number of Alive pirates in the crew - Number of consumed rum by the captain
//The loser crew has a random number of losses (deaths).
//The winner captain and crew has a party, including a random number of rum :)