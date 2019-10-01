package main.java.music;

public class Violin extends StringedInstrument {



    public Violin() {
       this.numberOfStrings = 4;
        this.name = "Violin";
    }
    public Violin(int strings){
        this.numberOfStrings = strings;
        this.name = "Violin";
    }

    @Override
    public String sound() {
        return "Screech";
    }

   }
