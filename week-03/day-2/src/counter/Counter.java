package counter;

public class Counter {

    int number = 0;
    int initial = 0;

    Counter () {
    }
    Counter(int number) {
        this.number = number;
        initial = number;
    }

    public void add (int anotherNumber) {
        number = number + anotherNumber;
    }
    public void add() {
        number += 1;
    }

    public int get() {
        return this.number;
    }

    public void reset() {
        this.number = initial;
    }

}


//Create Counter class
//which has an integer field value
//when creating it should have a default value 0 or we can specify it when creating
//we can add(number) to this counter another whole number
//or we can add() without parameters just increasing the counter's value by one
//and we can get() the current value
//also we can reset() the value to the initial value