package main.java.music;

/**
 * Created by Rita on 2016.11.16..
 */
public class ElectricGuitar extends StringedInstrument {

    public ElectricGuitar() { //first you need to add value, that can be used
        this(5);
    }

    public ElectricGuitar(int i) {
        super(i);
    }

    public void play() {
        System.out.println(formatForPlay, this.name, this.numberOfStrings, "Twang");
    }
}
