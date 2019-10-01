package main.java.music;

public class BassGuitar extends StringedInstrument{
    public BassGuitar(String name) {
        super(name);
        this.numberOfStrings = 4;
    }

    public BassGuitar(int i) {
        numberOfStrings = i;
        this.name = "BassGuitar";
    }
    public BassGuitar (){
        this.numberOfStrings = 4;
        this.name = "BassGuitar";
    }

    @Override
    public String sound() {
        return "Duum-duum-duum";
    }

}
