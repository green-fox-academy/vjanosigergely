package main.java.music;

public class ElectricGuitar extends StringedInstrument {



    public ElectricGuitar(String name) {
        super(name);
        this.numberOfStrings = 6;

    }

    public ElectricGuitar(int i) {
        this.numberOfStrings = i;
        this.name = "Electric Guitar";
    }

    public ElectricGuitar(){
        this.numberOfStrings = 6;
        this.name = "Electric Guitar";
    }

    @Override
    public String sound() {
        return "Twang";
    }

}
