package animal;

import java.util.ArrayList;
import java.util.List;

public class Farm {
    List<Animal> farm = new ArrayList();
    int animalSlot = 10;

    Farm(){
    }

    public void breed(Animal animal) {

        if (farm.size() < animalSlot) {
            farm.add(animal);
        }

    }
    public void slaughter (){
        Animal leastHungry = farm.get(0);
        for (Animal animal: farm) {
            if (animal.hunger < leastHungry.hunger) {
                leastHungry = animal;
            }
        }
        farm.remove(leastHungry);
    }

}
