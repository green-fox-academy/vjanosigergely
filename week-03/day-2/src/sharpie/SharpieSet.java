package sharpie;

import java.util.ArrayList;
import java.util.List;

public class SharpieSet {

    List<Sharpie> sharpieList = new ArrayList();

    public SharpieSet(){

    }

    public int countUsable() {
        int counter = 0;

        for (Sharpie sharpie: sharpieList) {
            if (sharpie.inkAmount > 0) {
                counter = counter +1;
            }
        }
        return counter;
    }

    public void removeTrash(){
        for (int i = 0; i < sharpieList.size()-1 ; i++) {
            if (sharpieList.get(i).inkAmount < 1 ) {
                sharpieList.remove(i);
            }
        }

    }


}


//it contains a list of Sharpie
//countUsable() -> sharpie is usable if it has ink in it
//removeTrash() -> removes all unusable sharpies