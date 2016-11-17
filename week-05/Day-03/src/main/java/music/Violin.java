package main.java.music;

/**
 * Created by Rita on 2016.11.16..
 */
public class Violin extends StringedInstrument {

    public Violin() {
        super("Violin",4);
    }

    @Override
    public String sound() {
        return "screech";
    }
}
//getters and setters - that is a behaviour of the object, which you can specify