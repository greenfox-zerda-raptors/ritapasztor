package main.java.music;

/**
 * Created by Rita on 2016.11.16..
 */
public class ElectricBassGuitar extends StringedInstrument {
    private static final String instrumentName = "ElectricBassGuitar";

    public ElectricBassGuitar() { //first you need to add value, that can be used
        super(instrumentName,6);
    }

    public ElectricBassGuitar(int numberOfStrings) {
        super(instrumentName, numberOfStrings);
    }
    @Override
    public String sound() {
        return "Dumm-dumm-dumm";
    }

}
