package main.java.music;

/**
 * Created by Rita on 2016.11.16..
 */
public abstract class Instrument { //public will be available for other packages in this project, within the package its available for all the classes
    protected String name;

    //public Instrument () {} //either here default is needed, because stringed Instruments are red, OR create a constructor in StringedInstruments, which fills in this one

    public Instrument(String name) {
        this.name = name;
    }

    //this.name = getClass().getSimpleName();

    abstract void play(); //you dont have implementation for abstarct classes, {no curly brackets needed}, you need to add implementation in the other classes
    public abstract String sound(); //in subclasses sound must be created

}
