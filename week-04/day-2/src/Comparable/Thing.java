package Comparable;

/**
 * Created by aze on 2017.03.29..
 */
public class Thing implements Comparable <Thing> {

    public static void main(String[] args) {

    }
    private String name;
    private boolean completed;

    public Thing(String name) {
        this.name = name;
    }

    public void complete() {
        this.completed = true;
    }

    @Override
    public String toString() {
        return (completed ? "[x] " : "[ ] ") + name;
    }

    @Override
    public int compareTo(Thing o) {
        if (this.completed == true && o.completed == false){
        return - 1;
        } else if (this.completed == false && o.completed == true) {
            return 1;
        } else {
            ////return this.name.compareTo(that.name);

            return this.name.compareTo(o.name);
        }


    }
}
