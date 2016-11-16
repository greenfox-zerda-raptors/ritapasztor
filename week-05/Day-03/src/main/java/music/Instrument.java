package main.java.music;

/**
 * Created by Rita on 2016.11.16..
 */
abstract public class Instrument {
    protected String name;

    abstract void play();

    public Instrument() {
        this.name = getClass().getSimpleName();
    }
}
