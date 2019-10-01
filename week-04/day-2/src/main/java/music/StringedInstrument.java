package main.java.music;

public abstract class StringedInstrument extends Instrument {

    int numberOfStrings;
    String name;

    StringedInstrument(String name) {
        super(name);
    }

    StringedInstrument(String name, int strings){
        super();
        this.name = name;
        numberOfStrings = strings;
    }

    public StringedInstrument() {

    }

    public abstract String sound();

    public void play(){
        System.out.println(this.name + ", a " + this.numberOfStrings + "-stringed instrument that goes " + sound());
    }
}
