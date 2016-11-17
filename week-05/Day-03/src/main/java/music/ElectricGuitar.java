package main.java.music;

/**
 * Created by Rita on 2016.11.16..
 */
public class ElectricGuitar extends StringedInstrument {

    public ElectricGuitar() { //first you need to add value, that can be used
        super("ElectricGuitar", 6);
    }

    public ElectricGuitar(int numberOfStrings) {
        super("ElectricGuitar", numberOfStrings);
    }

    @Override
    public String sound() {
        return "Twang";
    }
}
